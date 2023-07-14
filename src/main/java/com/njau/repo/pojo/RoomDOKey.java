package com.njau.repo.pojo;

public class RoomDOKey {
    private Integer zone;

    private String id;

    public RoomDOKey() {
    }

    public RoomDOKey(Integer zone, String id) {
        this.zone = zone;
        this.id = id;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}