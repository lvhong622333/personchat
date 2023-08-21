package com.lvhong.service;

import com.github.pagehelper.PageInfo;
import com.lvhong.pojo.wechatmodule.TBuNotePad;

public interface BuNotePadService {
    PageInfo<TBuNotePad> queryBuNotePad(TBuNotePad tBuNotePad);

    void buNotePadAdd(TBuNotePad tBuNotePad);

}
