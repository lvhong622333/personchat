package com.lvhong.pojo.basicdata;

import java.util.Date;

public class TSysRole {
    private Long id;

    private String roleCode;

    private String roleName;

    private String roleDesc;

    private String isvalid;

    private Date createDate;

    private Long createBy;

    private Date uptimeDate;

    private Long uptimeBy;

    public TSysRole(Long id, String roleCode, String roleName, String roleDesc, String isvalid, Date createDate, Long createBy, Date uptimeDate, Long uptimeBy) {
        this.id = id;
        this.roleCode = roleCode;
        this.roleName = roleName;
        this.roleDesc = roleDesc;
        this.isvalid = isvalid;
        this.createDate = createDate;
        this.createBy = createBy;
        this.uptimeDate = uptimeDate;
        this.uptimeBy = uptimeBy;
    }

    public TSysRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode == null ? null : roleCode.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
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