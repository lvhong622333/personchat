package com.lvhong.service.impl;

import com.baidu.fsg.uid.impl.CachedUidGenerator;
import com.lvhong.mapper.basicdata.TSysUserMapper;
import com.lvhong.pojo.basicdata.TSysUser;
import com.lvhong.service.UserService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private TSysUserMapper tSysUserMapper;

    @Resource(name = "cachedUidGenerator")
    private CachedUidGenerator cachedUidGenerator;

    @Override
    public void insertUserInfo() {
        TSysUser tSysUser = new TSysUser();
        tSysUser.setId(cachedUidGenerator.getUID());
        tSysUser.setUserCode("11110001");
        tSysUser.setUserName("吕鸿");
        tSysUserMapper.insert(tSysUser);
    }
}
