package com.wkl.mybatis.pojo;

public class Menu {
    private int menuId;
    private String menuName;
    private String menuIcon;
    private String menuUrl;
    private int parentId;
    private char menuState;

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public char getMenuState() {
        return menuState;
    }

    public void setMenuState(char menuState) {
        this.menuState = menuState;
    }
}
