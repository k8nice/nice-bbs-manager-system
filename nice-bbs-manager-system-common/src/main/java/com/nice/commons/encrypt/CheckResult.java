package com.nice.commons.encrypt;

import io.jsonwebtoken.Claims;
import lombok.Data;

/**
 * jwt验证结果
 * @author nice
 */
@Data
public class CheckResult {

    private int errCode;

    private boolean success;

    private Claims claims;
}
