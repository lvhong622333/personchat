package com.lvhong.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvhong.mapper.wechatmodule.TBuNotePadMapper;
import com.lvhong.pojo.wechatmodule.TBuChargeUp;
import com.lvhong.pojo.wechatmodule.TBuNotePad;
import com.lvhong.service.BuNotePadService;
import com.lvhong.util.CodeEditor;
import com.lvhong.util.UidUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BuNotePadImpl implements BuNotePadService {

    @Resource
    private TBuNotePadMapper buNotePadMapper;

    @Override
    public PageInfo<TBuNotePad> queryBuNotePad(TBuNotePad tBuNotePad) {
        PageHelper.startPage(tBuNotePad.getCurrentPage(), tBuNotePad.getPageSize());
        List<TBuNotePad> list =  buNotePadMapper.selectBuNodePadPage(tBuNotePad);
        return new PageInfo<TBuNotePad>(list);
    }

    @Override
    public void buNotePadAdd(TBuNotePad tBuNotePad) {
        tBuNotePad.setId(UidUtils.getUid());
        tBuNotePad.setBillNo(CodeEditor.generatorCode(CodeEditor.CODE_PREFIX_JS));
        buNotePadMapper.insertSelective(tBuNotePad);
    }
}
