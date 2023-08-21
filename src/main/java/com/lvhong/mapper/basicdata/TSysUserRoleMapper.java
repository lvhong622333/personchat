package com.lvhong.mapper.basicdata;

import com.lvhong.pojo.basicdata.TSysUserRole;

public interface TSysUserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSysUserRole record);

    int insertSelective(TSysUserRole record);

    TSysUserRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSysUserRole record);

    int updateByPrimaryKey(TSysUserRole record);
}