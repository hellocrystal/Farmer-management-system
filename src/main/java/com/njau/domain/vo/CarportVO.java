package com.njau.domain.vo;

import java.util.Date;

/**
 * CarportVO
 *
 * @since 2022/04/21.
 */
public class CarportVO {
    private String zoneId;

    private Integer carportId;
    private String userName;
    private Integer roomZone;

    private String roomId;

    private Byte state;

    private Integer price;

    private String staffUsername;

    private Date buytime;

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Integer getCarportId() {
        return carportId;
    }

    public void setCarportId(Integer carportId) {
        this.carportId = carportId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
        this.roomId = roomId;
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

    public String getStaffUsername() {
        return staffUsername;
    }

    public void setStaffUsername(String staffUsername) {
        this.staffUsername = staffUsername;
    }
}
