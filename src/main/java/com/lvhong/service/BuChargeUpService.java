package com.lvhong.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lvhong.pojo.wechatmodule.TBuChargeUp;
import com.lvhong.pojo.wechatmodule.TbuChargeUpSum;

import java.util.List;

public interface BuChargeUpService {
    void saveBuChargeUp(TBuChargeUp tBuChargeUp);

    PageInfo<TBuChargeUp> queryBuChargeUp(TBuChargeUp tBuChargeUp);

    String queryBillNoByPrefixCode(String prefixCode);

    TBuChargeUp queryBuChargeUpByBillNo(String billno);

    void updateBuChargeUp(TBuChargeUp tBuChargeUp);

    void deleteBuChargeUp(TBuChargeUp tBuChargeUp);

    PageInfo<TbuChargeUpSum> queryBuChargeUpGroupByList(TbuChargeUpSum tbuChargeUpSum);

}
