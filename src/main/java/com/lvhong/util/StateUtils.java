package com.lvhong.util;

public enum StateUtils {
    FAIL("500","FAIL"),SUCCESS("200","SUCCESS");
    public String code;
    public String name;

    StateUtils(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
