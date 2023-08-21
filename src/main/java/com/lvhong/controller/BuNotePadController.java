package com.lvhong.controller;

import com.github.pagehelper.PageInfo;
import com.lvhong.pojo.ResultValue;
import com.lvhong.pojo.wechatmodule.TBuNotePad;
import com.lvhong.service.BuNotePadService;
import com.lvhong.util.StateUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/buNotePad")
public class BuNotePadController {

    @Resource
    private BuNotePadService buNotePadService;

    @RequestMapping("/queryBuNotePad")
    @ResponseBody
    public ResultValue<PageInfo<TBuNotePad>> queryBuNotePad(TBuNotePad tBuNotePad){
        ResultValue<PageInfo<TBuNotePad>> rs = new ResultValue<PageInfo<TBuNotePad>>();
        try{
            PageInfo<TBuNotePad> list  =  buNotePadService.queryBuNotePad(tBuNotePad);
            rs.setData(list);
        }catch(Exception e ){
            rs.setCode(StateUtils.FAIL.code);
            rs.setState(StateUtils.FAIL.name);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

    @RequestMapping("/buNotePadAdd")
    @ResponseBody
    public ResultValue<String> buNotePadAdd(TBuNotePad tBuNotePad){
        ResultValue<String> rs = new ResultValue<String>();
        try{
            buNotePadService.buNotePadAdd(tBuNotePad);
        }catch(Exception e){
            rs.setCode(StateUtils.FAIL.code);
            rs.setState(StateUtils.FAIL.name);
            rs.setMessage(e.getMessage());
        }
        return rs;
    }

}
