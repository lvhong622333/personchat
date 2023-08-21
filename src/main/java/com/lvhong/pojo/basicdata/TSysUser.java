package com.lvhong.pojo.basicdata;

import java.util.Date;

public class TSysUser {
    private Long id;

    private Long parentId;

    private String userCode;

    private String userName;

    private String nickName;

    private String wechatNo;

    private String email;

    private String phone;

    private String sex;

    private String card;

    private String isvalid;

    private Date createDate;

    private Long createBy;

    private Date uptimeDate;

    private Long uptimeBy;

    public TSysUser(Long id, Long parentId, String userCode, String userName, String nickName, String wechatNo, String email, String phone, String sex, String card, String isvalid, Date createDate, Long createBy, Date uptimeDate, Long uptimeBy) {
        this.id = id;
        this.parentId = parentId;
        this.userCode = userCode;
        this.userName = userName;
        this.nickName = nickName;
        this.wechatNo = wechatNo;
        this.email = email;
        this.phone = phone;
        this.sex = sex;
        this.card = card;
        this.isvalid = isvalid;
        this.createDate = createDate;
        this.createBy = createBy;
        this.uptimeDate = uptimeDate;
        this.uptimeBy = uptimeBy;
    }

    public TSysUser() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getWechatNo() {
        return wechatNo;
    }

    public void setWechatNo(String wechatNo) {
        this.wechatNo = wechatNo == null ? null : wechatNo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getUptimeDate() {
        return uptimeDate;
    }

    public void setUptimeDate(Date uptimeDate) {
        this.uptimeDate = uptimeDate;
    }

    public Long getUptimeBy() {
        return uptimeBy;
    }

    public void setUptimeBy(Long uptimeBy) {
        this.uptimeBy = uptimeBy;
    }
}