package com.nice.commons.interceptor.config;

import com.nice.commons.interceptor.LoginHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;

import java.nio.charset.Charset;
import java.util.List;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 拦截器
 * @author ningh
 */
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    @Bean
    public HttpMessageConverter<String>  responseBodyConverter(){
        StringHttpMessageConverter converter = new StringHttpMessageConverter(
          Charset.forName("utf-8")
        );
        return converter;
    }

    /**
     * 加载拦截处理
     * @return loginHandlerInterceptor 登录处理拦截
     */
    @Bean
    public LoginHandlerInterceptor loadHandlerInterceptor(){
        return new LoginHandlerInterceptor();
    }

    @Override
    protected void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        super.configureContentNegotiation(configurer);
        configurer.favorPathExtension(false);
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        converters.add(responseBodyConverter());
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //放行注册路径和登录路径
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                .excludePathPatterns( "/", "/login/index","/js/**","/css/**","/kindeditor/**","/register/index","/register","/login/auth","/static/**","/login/sys/user/check");
        //  registry.addInterceptor(new LoginHandlerInterceptor()).excludePathPatterns("/");
//        registry.addInterceptor(new LoginHandlerInterceptor()).excludePathPatterns();
        super.addInterceptors(registry);
    }

    @Override
    protected void addViewControllers(ViewControllerRegistry registry) {
        super.addViewControllers(registry);
//        registry.addViewController("/").
    }

    /**
     * 添加资源处理
     * @param registry  资源注册处理
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //放行静态资源路径
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        super.addResourceHandlers(registry);
    }

    @Override
    protected void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedMethods("GET","POST")
                .maxAge(3600);
        super.addCorsMappings(registry);
    }


}
