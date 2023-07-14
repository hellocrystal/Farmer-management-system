package com.njau.repo.pojo;

import java.util.Date;

public class FeeDO {
    private Integer id;

    private Integer feeItemId;

    private String staffUsername;

    private Date time;

    private Integer zone;

    private String roomId;

    private Byte state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFeeItemId() {
        return feeItemId;
    }

    public void setFeeItemId(Integer feeItemId) {
        this.feeItemId = feeItemId;
    }

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername == null ? null : staffUsername.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId == null ? null : roomId.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }
}