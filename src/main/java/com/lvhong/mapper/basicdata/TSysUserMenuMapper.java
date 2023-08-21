package com.lvhong.mapper.basicdata;

import com.lvhong.pojo.basicdata.TSysUserMenu;

public interface TSysUserMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSysUserMenu record);

    int insertSelective(TSysUserMenu record);

    TSysUserMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSysUserMenu record);

    int updateByPrimaryKey(TSysUserMenu record);
}