package com.lvhong.mapper.wechatmodule;

import com.lvhong.pojo.wechatmodule.TBuNotePad;

import java.util.List;

public interface TBuNotePadMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBuNotePad record);

    int insertSelective(TBuNotePad record);

    TBuNotePad selectByPrimaryKey(Long id);

    int uptimeByPrimaryKeySelective(TBuNotePad record);

    int uptimByPrimaryKey(TBuNotePad record);

    List<TBuNotePad> selectBuNodePadPage(TBuNotePad tBuNotePad);

    TBuNotePad buNotePadDetail(String billno);
}