package com.lvhong.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lvhong.pojo.ResultValue;
import com.lvhong.pojo.wechatmodule.TBuChargeUp;
import com.lvhong.pojo.wechatmodule.TbuChargeUpSum;
import com.lvhong.service.BuChargeUpService;
import com.lvhong.util.StateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 记账功能模块
 * @author lvhong
 * @date 2023-07-28
 */
@Controller
@RequestMapping("/buChargeUp")
public class BuChargeUpController {

    @Resource
    private BuChargeUpService buChargeUpService;

    /**
     * 保存记账信息
     * @author lvhong
     * @date 2023-07-28
     * @param tBuChargeUp
     * @return
     */
    @RequestMapping("/saveBuChargeUp")
    @ResponseBody
    public ResultValue<String> saveBuChargeUp(TBuChargeUp tBuChargeUp){
        ResultValue<String> rs = new ResultValue<String>();
        try{
            buChargeUpService.saveBuChargeUp(tBuChargeUp);
        }catch(Exception e){
            rs.setCode(StateUtils.FAIL.code);
            rs.setState(StateUtils.FAIL.name);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

    /**
     * 查询记账列表
     * @author lvhong
     * @date 2023-07-28
     * @param tBuChargeUp
     * @return
     */
    @RequestMapping("/queryBuChargeUpList")
    @ResponseBody
    public ResultValue<PageInfo<TBuChargeUp>> queryBuChargeUpList(TBuChargeUp tBuChargeUp){
        ResultValue<PageInfo<TBuChargeUp>> rs= new  ResultValue<PageInfo<TBuChargeUp>>();
        try{
            PageInfo<TBuChargeUp>  list =  buChargeUpService.queryBuChargeUp(tBuChargeUp);
            rs.setData(list);
        }catch(Exception e){
            rs.setState(StateUtils.FAIL.name);
            rs.setCode(StateUtils.FAIL.code);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

    /**
     * 查询单据详情
     * @author lvhong
     * @date 2023-08-08
     * @param billno 单据号
     * @return
     */
    @RequestMapping("/queryBuChargeUp")
    @ResponseBody
    public ResultValue<TBuChargeUp> queryBuChargeUp(String billno){
        ResultValue<TBuChargeUp> rs= new  ResultValue<TBuChargeUp>();
        try{
            TBuChargeUp  tBuChargeUp =  buChargeUpService.queryBuChargeUpByBillNo(billno);
            if(tBuChargeUp != null){
                rs.setData(tBuChargeUp);
            }else{
                rs.setState(StateUtils.FAIL.name);
                rs.setCode(StateUtils.FAIL.code);
            }
        }catch(Exception e){
            rs.setState(StateUtils.FAIL.name);
            rs.setCode(StateUtils.FAIL.code);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

    @RequestMapping("/updateBuChargeUp")
    @ResponseBody
    public ResultValue<String> updateBuChargeUp(TBuChargeUp tBuChargeUp){
        ResultValue<String> rs = new ResultValue<String>();
        try{
            buChargeUpService.updateBuChargeUp(tBuChargeUp);
        }catch(Exception e){
            rs.setState(StateUtils.FAIL.name);
            rs.setCode(StateUtils.FAIL.code);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

    @RequestMapping("/deleteBuChargeUp")
    @ResponseBody
    public ResultValue<String> deleteBuChargeUp(TBuChargeUp tBuChargeUp){
        ResultValue<String> rs = new ResultValue<String>();
        try{
            buChargeUpService.deleteBuChargeUp(tBuChargeUp);
        }catch(Exception e){
            rs.setState(StateUtils.FAIL.name);
            rs.setCode(StateUtils.FAIL.code);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

    @RequestMapping("/queryBuChargeUpGroupByList")
    @ResponseBody
    public ResultValue<PageInfo<TbuChargeUpSum>> queryBuChargeUpGroupByList(TbuChargeUpSum tbuChargeUpSum){
        ResultValue<PageInfo<TbuChargeUpSum>> rs= new  ResultValue<PageInfo<TbuChargeUpSum>>();
        try{
            PageInfo<TbuChargeUpSum>  list =  buChargeUpService.queryBuChargeUpGroupByList(tbuChargeUpSum);
            rs.setData(list);
        }catch(Exception e){
            rs.setState(StateUtils.FAIL.name);
            rs.setCode(StateUtils.FAIL.code);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }
}
