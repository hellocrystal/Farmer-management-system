package com.njau.repo.pojo;

import java.util.Date;

public class CarportDO extends CarportDOKey {
    private Date buytime;

    private Integer roomZone;

    private String roomId;

    private Byte state;

    private Integer price;

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public Integer getRoomZone() {
        return roomZone;
    }

    public void setRoomZone(Integer roomZone) {
        this.roomZone = roomZone;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}