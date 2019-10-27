package com.nice.mapper;

import com.nice.domain.BbsInvitationType;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ningh
 */
@Mapper
public interface BbsInvitationTypeMapper {

    /**
     * 根据bbs帖子类型名称查找帖子类型名称
     * @param bbsInvitationTypeName 帖子类型名称
     * @return  bbsInvitationTypeName 帖子类型名称
     */
    String queryBbsInvitationTypeNameByBbsInvitationTypeName(String bbsInvitationTypeName);

    /**
     * 新增bbs帖子类型
     * @param bbsInvitationType
     */
    void  insertBbsInvitationType(BbsInvitationType bbsInvitationType);

}
