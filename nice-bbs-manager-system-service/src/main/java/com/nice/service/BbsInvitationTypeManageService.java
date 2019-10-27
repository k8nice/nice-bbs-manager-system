package com.nice.service;

import com.nice.domain.BbsInvitationType;

/**
 * bbs帖子类型管理服务接口
 * @author ningh
 */
public interface BbsInvitationTypeManageService {

    /**
     * 创建帖子类型
     * @param bbsInvitationType bbs帖子类型
     * @return true or false
     */
    Boolean createBbsInvitationType(BbsInvitationType bbsInvitationType,Long bbsSysUserId);

}
