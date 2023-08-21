package com.lvhong.pojo.basicdata;

import java.util.Date;

public class TSysRoleMenu {
    private Long id;

    private Long roleId;

    private Long menuId;

    private String isvalid;

    private Date createDate;

    private Long createBy;

    private Date uptimeDate;

    private Long uptimeBy;

    public TSysRoleMenu(Long id, Long roleId, Long menuId, String isvalid, Date createDate, Long createBy, Date uptimeDate, Long uptimeBy) {
        this.id = id;
        this.roleId = roleId;
        this.menuId = menuId;
        this.isvalid = isvalid;
        this.createDate = createDate;
        this.createBy = createBy;
        this.uptimeDate = uptimeDate;
        this.uptimeBy = uptimeBy;
    }

    public TSysRoleMenu() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
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