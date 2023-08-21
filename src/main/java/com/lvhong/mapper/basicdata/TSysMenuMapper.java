package com.lvhong.mapper.basicdata;

import com.lvhong.pojo.basicdata.TSysMenu;

public interface TSysMenuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TSysMenu record);

    int insertSelective(TSysMenu record);

    TSysMenu selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TSysMenu record);

    int updateByPrimaryKey(TSysMenu record);
}