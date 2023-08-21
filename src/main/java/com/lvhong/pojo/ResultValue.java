package com.lvhong.pojo;

import com.lvhong.util.StateUtils;

public class ResultValue<T> {
    private T data;
    private String state = StateUtils.SUCCESS.name;
    private String code = StateUtils.SUCCESS.code;
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
