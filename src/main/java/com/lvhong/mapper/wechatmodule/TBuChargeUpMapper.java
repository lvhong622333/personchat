package com.lvhong.mapper.wechatmodule;

import com.lvhong.pojo.wechatmodule.TBuChargeUp;
import com.lvhong.pojo.wechatmodule.TbuChargeUpSum;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TBuChargeUpMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TBuChargeUp record);

    int insertSelective(TBuChargeUp record);

    TBuChargeUp selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TBuChargeUp record);

    int updateByPrimaryKey(TBuChargeUp record);

    List<TBuChargeUp> selectListByPage(TBuChargeUp tBuChargeUp);

    @Select("select bill_no from t_bu_charge_up where bill_no like  concat(#{prefixCode},'%')   order by id desc limit 0,1")
    String queryBillNoByPrefixCode(@Param("prefixCode") String prefixCode);

    TBuChargeUp queryBuChargeUpByBillNo(String billno);

    List<TbuChargeUpSum> queryBuChargeUpGroupByList(TbuChargeUpSum tbuChargeUpSum);
}