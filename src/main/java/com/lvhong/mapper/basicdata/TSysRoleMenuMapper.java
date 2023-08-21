package com.lvhong.mapper.basicdata;

import com.lvhong.pojo.basicdata.TSysRoleMenu;

public interface TSysRoleMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSysRoleMenu record);

    int insertSelective(TSysRoleMenu record);

    TSysRoleMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSysRoleMenu record);

    int updateByPrimaryKey(TSysRoleMenu record);
}