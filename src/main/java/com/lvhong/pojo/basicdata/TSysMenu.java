package com.lvhong.pojo.basicdata;

import java.util.Date;

public class TSysMenu {
    private Long id;

    private String menuName;

    private String menuCode;

    private String isvalid;

    private Date createDate;

    private Long createBy;

    private Date uptimeDate;

    private Long uptimeBy;

    public TSysMenu(Long id, String menuName, String menuCode, String isvalid, Date createDate, Long createBy, Date uptimeDate, Long uptimeBy) {
        this.id = id;
        this.menuName = menuName;
        this.menuCode = menuCode;
        this.isvalid = isvalid;
        this.createDate = createDate;
        this.createBy = createBy;
        this.uptimeDate = uptimeDate;
        this.uptimeBy = uptimeBy;
    }

    public TSysMenu() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
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