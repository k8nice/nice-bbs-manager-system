package com.nice.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * @author ningh
 */
@Mapper
public interface BbsInvitationTypeMapper {

    String queryBbsInvitationTypeNameByBbsInvitationTypeName(String bbsInvitationTypeName);

}
