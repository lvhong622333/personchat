package com.lvhong.pojo.wechatmodule;

import com.lvhong.pojo.BasePOJO;

import java.math.BigDecimal;
import java.util.Date;

public class TbuChargeUpSum extends BasePOJO {
    private String accountDate;
    private BigDecimal incomeMoneys;
    private BigDecimal sumExpands;

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public BigDecimal getIncomeMoneys() {
        return incomeMoneys;
    }

    public void setIncomeMoneys(BigDecimal incomeMoneys) {
        this.incomeMoneys = incomeMoneys;
    }

    public BigDecimal getSumExpands() {
        return sumExpands;
    }

    public void setSumExpands(BigDecimal sumExpands) {
        this.sumExpands = sumExpands;
    }
}
