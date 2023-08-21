package com.lvhong.util;

import com.baidu.fsg.uid.impl.CachedUidGenerator;

import javax.annotation.Resource;

public class UidUtils {



//    @Resource(name = "cachedUidGenerator")
//    private CachedUidGenerator cachedUidGenerator;
    /**
     * 同步获取uid，每次保证只有一个线程可以获得uid
     * @author lvhong
     * @date 2023-07-28
     * @return
     */
    public static synchronized Long getUid(){
        CachedUidGenerator cachedUidGenerator = (CachedUidGenerator) SpringContext.getBean("cachedUidGenerator");
        Long uid = cachedUidGenerator.getUID();
        return uid;
    }


}
