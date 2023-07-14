package com.njau.repo.pojo;

public class ManageCarportDO extends ManageCarportDOKey {
    private Byte type;

    private Byte result;

    private String staffUsername;

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Byte getResult() {
        return result;
    }

    public void setResult(Byte result) {
        this.result = result;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername == null ? null : staffUsername.trim();
    }
}