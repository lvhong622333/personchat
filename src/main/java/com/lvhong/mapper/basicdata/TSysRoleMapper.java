package com.lvhong.mapper.basicdata;

import com.lvhong.pojo.basicdata.TSysRole;

public interface TSysRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSysRole record);

    int insertSelective(TSysRole record);

    TSysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSysRole record);

    int updateByPrimaryKey(TSysRole record);
}