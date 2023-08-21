package com.lvhong.util;

import com.lvhong.service.BuChargeUpService;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

/**
 * 模块单据编号生成工具类
 * @author lvhong
 * @date 2023-07-28
 */
public class CodeEditor {

    public static final String CODE_PREFIX_JZ = "JZ"; //记账模块

    public static final String CODE_PREFIX_JS = "JS"; //记事本模块

    public static Integer numIcrRandom = 0;

    public static String checkTime = "20230728";

    /**
     * 生成单据编号
     * @author lvhong
     * @date 2023-07-28
     * @param codePrefix
     * @return
     */
    public static synchronized String generatorCode(String codePrefix){
        String timeStr = DateFormatUtils.formatDate(new Date(), DateFormatUtils.FORMAT_FIVE);
        if(!checkTime.equals(timeStr)){
            checkTime = timeStr;
            numIcrRandom = 0;
        }
        String prefixCode =  codePrefix + timeStr;
        if(numIcrRandom == 0){
            //查找数据库，同类型编码的当天的数据是否已经生成过序号
            BuChargeUpService buChargeUpService = (BuChargeUpService) SpringContext.getBean("buChargeUpService");
            String billNo = buChargeUpService.queryBillNoByPrefixCode(prefixCode);
            if(!StringUtils.isEmpty(billNo)){
                String num = billNo.substring(billNo.length() - 3);
                String s = num.replaceAll("0", "");
                numIcrRandom = Integer.parseInt(s);
            }
        }
        numIcrRandom  = numIcrRandom + 1;
        String code = prefixCode + zeroComp(numIcrRandom.toString());
        return code;
    }

    private static String zeroComp(String num){
        if(num.length() == 1){
            num = "00" + num;
        }else if(num.length() == 2){
            num = "0" + num;
        }
        return num;
    }

}
