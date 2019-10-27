package com.nice.service.impl;

import com.nice.domain.BbsInvitationType;
import com.nice.mapper.BbsInvitationTypeMapper;
import com.nice.service.BbsInvitationTypeManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * bbs帖子类型管理服务接口实现类
 * @author ningh
 */
@Service
public class BbsInvitationTypeManageServiceImpl implements BbsInvitationTypeManageService {

    /**
     * 注册mapper
     */
    @Autowired
    private BbsInvitationTypeMapper bbsInvitationTypeMapper;

    /**
     * 创建帖子类型
     * @param bbsInvitationType bbs帖子类型
     * @return  true or false
     */
    @Override
    public Boolean createBbsInvitationType(BbsInvitationType bbsInvitationType) {
        if (checkBbsInvitationTypeIsExist(bbsInvitationType.getBbsInvitationTypeName())){

            throw new RuntimeException("帖子类型已存在");
        }
        return false;
    }

    /**
     * 检测帖子类型是否存在
     * @param bbsInvitationTypeName 帖子类型名称
     * @return
     */
    private Boolean  checkBbsInvitationTypeIsExist(String bbsInvitationTypeName){
        if (bbsInvitationTypeName.equals(bbsInvitationTypeMapper.queryBbsInvitationTypeNameByBbsInvitationTypeName(bbsInvitationTypeName))){
            return true;
        }
        else {
            return false;
        }
    }
}
