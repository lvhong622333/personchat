package com.lvhong.pojo.wechatmodule;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.lvhong.pojo.BasePOJO;

import java.math.BigDecimal;
import java.util.Date;

public class TBuChargeUp extends BasePOJO {
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    private String billNo;

    private String accountDesc;

    private Integer accountType;

    private BigDecimal accountMoney;

    private Date accountDate;

    private Integer no;

    private String accountDateStr;

    private String accountTypeStr;

    private String typeCode;

    private String stypeDesc;

    public String getStypeDesc() {
        return stypeDesc;
    }

    public void setStypeDesc(String stypeDesc) {
        this.stypeDesc = stypeDesc;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public TBuChargeUp() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo == null ? null : billNo.trim();
    }

    public String getAccountDesc() {
        return accountDesc;
    }

    public void setAccountDesc(String accountDesc) {
        this.accountDesc = accountDesc == null ? null : accountDesc.trim();
    }

    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(BigDecimal accountMoney) {
        this.accountMoney = accountMoney;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getAccountDateStr() {
        return accountDateStr;
    }

    public void setAccountDateStr(String accountDateStr) {
        this.accountDateStr = accountDateStr;
    }

    public String getAccountTypeStr() {
        return accountTypeStr;
    }

    public void setAccountTypeStr(String accountTypeStr) {
        this.accountTypeStr = accountTypeStr;
    }
}