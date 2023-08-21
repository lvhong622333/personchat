package com.lvhong.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化工具类
 * @author lvhong
 * @date 2023-07-28
 */
public class DateFormatUtils {

    /**
     *  yyyy-MM-dd
     */
    public static final String FORMAT = "yyyy-MM-dd";

    /**
     *  yyyy-MM-dd hh24:mi:ss
     */
    public static final String FORMAT_ONE = "yyyy-MM-dd HH:mm:ss";

    /**
     * yyyy/MM/dd
     */
    public static final String FORMAT_TWO = "yyyy/MM/dd";

    /**
     * yyyy/MM/dd hh24:mi:s
     */
    public static final String FORMAT_THREE = "yyyy/MM/dd HH:mm:ss";

    public static final String FORMAT_FIVE = "yyyyMMdd";


    /**
     *  日期格式化
     * @author lvhong
     * @date 2023-07-28
     * @param date 日期
     * @param format 格式参数
     * @return
     */
    public static String formatDate(Date date, String format){
        SimpleDateFormat sdf= new SimpleDateFormat(format);
        String dateformat = sdf.format(date);
        return dateformat;
    }
}
