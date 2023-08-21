package com.lvhong.pojo.basicdata;

import java.util.Date;

public class TSysUserPermission {
    private Long id;

    private Long authSubject;

    private Long bailee;

    private Long authFuncMenu;

    private String readWritePermission;

    private String isvalid;

    private Date createDate;

    private Long createBy;

    private Date uptimeDate;

    private Long uptimeBy;

    public TSysUserPermission(Long id, Long authSubject, Long bailee, Long authFuncMenu, String readWritePermission, String isvalid, Date createDate, Long createBy, Date uptimeDate, Long uptimeBy) {
        this.id = id;
        this.authSubject = authSubject;
        this.bailee = bailee;
        this.authFuncMenu = authFuncMenu;
        this.readWritePermission = readWritePermission;
        this.isvalid = isvalid;
        this.createDate = createDate;
        this.createBy = createBy;
        this.uptimeDate = uptimeDate;
        this.uptimeBy = uptimeBy;
    }

    public TSysUserPermission() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthSubject() {
        return authSubject;
    }

    public void setAuthSubject(Long authSubject) {
        this.authSubject = authSubject;
    }

    public Long getBailee() {
        return bailee;
    }

    public void setBailee(Long bailee) {
        this.bailee = bailee;
    }

    public Long getAuthFuncMenu() {
        return authFuncMenu;
    }

    public void setAuthFuncMenu(Long authFuncMenu) {
        this.authFuncMenu = authFuncMenu;
    }

    public String getReadWritePermission() {
        return readWritePermission;
    }

    public void setReadWritePermission(String readWritePermission) {
        this.readWritePermission = readWritePermission == null ? null : readWritePermission.trim();
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