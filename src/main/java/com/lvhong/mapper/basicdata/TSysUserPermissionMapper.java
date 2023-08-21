package com.lvhong.mapper.basicdata;

import com.lvhong.pojo.basicdata.TSysUserPermission;

public interface TSysUserPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSysUserPermission record);

    int insertSelective(TSysUserPermission record);

    TSysUserPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSysUserPermission record);

    int updateByPrimaryKey(TSysUserPermission record);
}