package com.lvhong.pojo.wechatmodule;

import com.lvhong.pojo.BasePOJO;

import java.util.Date;

public class TBuNotePad extends BasePOJO {
    private Long id;

    private Date planDate;

    private Date actulDate;

    private String noteDesc;

    private String billNo;

    private String actulDateStr;

    private String planDateStr;


    public String getActulDateStr() {
        return actulDateStr;
    }

    public void setActulDateStr(String actulDateStr) {
        this.actulDateStr = actulDateStr;
    }

    public String getPlanDateStr() {
        return planDateStr;
    }

    public void setPlanDateStr(String planDateStr) {
        this.planDateStr = planDateStr;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public TBuNotePad() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getPlanDate() {
        return planDate;
    }

    public void setPlanDate(Date planDate) {
        this.planDate = planDate;
    }

    public Date getActulDate() {
        return actulDate;
    }

    public void setActulDate(Date actulDate) {
        this.actulDate = actulDate;
    }

    public String getNoteDesc() {
        return noteDesc;
    }

    public void setNoteDesc(String noteDesc) {
        this.noteDesc = noteDesc == null ? null : noteDesc.trim();
    }
}