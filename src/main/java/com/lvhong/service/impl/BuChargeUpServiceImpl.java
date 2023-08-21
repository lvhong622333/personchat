package com.lvhong.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvhong.mapper.wechatmodule.TBuChargeUpMapper;
import com.lvhong.pojo.wechatmodule.TBuChargeUp;
import com.lvhong.pojo.wechatmodule.TbuChargeUpSum;
import com.lvhong.service.BuChargeUpService;
import com.lvhong.util.CodeEditor;
import com.lvhong.util.UidUtils;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service("buChargeUpService")
public class BuChargeUpServiceImpl implements BuChargeUpService {

    @Resource
    private TBuChargeUpMapper buChargeUpMapper;

    @Override
    public void saveBuChargeUp(TBuChargeUp tBuChargeUp) {
        tBuChargeUp.setId(UidUtils.getUid());
        tBuChargeUp.setBillNo(CodeEditor.generatorCode(CodeEditor.CODE_PREFIX_JZ));
        buChargeUpMapper.insertSelective(tBuChargeUp);
    }

    @Override
    public PageInfo<TBuChargeUp> queryBuChargeUp(TBuChargeUp tBuChargeUp) {
         PageHelper.startPage(tBuChargeUp.getCurrentPage(), tBuChargeUp.getPageSize());
        List<TBuChargeUp> list = buChargeUpMapper.selectListByPage(tBuChargeUp);
        return new PageInfo<TBuChargeUp>(list);
    }

    @Override
    public String queryBillNoByPrefixCode(String prefixCode) {
       return  buChargeUpMapper.queryBillNoByPrefixCode(prefixCode);
    }

    @Override
    public TBuChargeUp queryBuChargeUpByBillNo(String billno) {
        TBuChargeUp tBuChargeUp = buChargeUpMapper.queryBuChargeUpByBillNo(billno);
        return tBuChargeUp;
    }

    @Override
    public void updateBuChargeUp(TBuChargeUp tBuChargeUp) {
        buChargeUpMapper.updateByPrimaryKeySelective(tBuChargeUp);
    }

    @Override
    public void deleteBuChargeUp(TBuChargeUp tBuChargeUp) {
        buChargeUpMapper.deleteByPrimaryKey(tBuChargeUp.getId());
    }

    @Override
    public PageInfo<TbuChargeUpSum> queryBuChargeUpGroupByList(TbuChargeUpSum tbuChargeUpSum) {
        PageHelper.startPage(tbuChargeUpSum.getCurrentPage(), tbuChargeUpSum.getPageSize());
        List<TbuChargeUpSum> list = buChargeUpMapper.queryBuChargeUpGroupByList(tbuChargeUpSum);
        return new PageInfo<TbuChargeUpSum>(list);
    }
}
