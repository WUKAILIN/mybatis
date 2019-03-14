package com.wkl.mybatis.pojo;

public class Role {
    private int roleId;
    private String roleName;
    private char roleState;
    private String createDate;
    private String updateDate;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public char getRoleState() {
        return roleState;
    }

    public void setRoleState(char roleState) {
        this.roleState = roleState;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
}
