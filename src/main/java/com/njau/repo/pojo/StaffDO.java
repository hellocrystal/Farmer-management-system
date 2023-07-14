package com.njau.repo.pojo;

import java.util.Date;

public class StaffDO {
    private String username;

    private Integer dno;

    private Date officetime;

    private Date quittime;

    private Integer salary;

    private Integer bonus;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getDno() {
        return dno;
    }

    public void setDno(Integer dno) {
        this.dno = dno;
    }

    public Date getOfficetime() {
        return officetime;
    }

    public void setOfficetime(Date officetime) {
        this.officetime = officetime;
    }

    public Date getQuittime() {
        return quittime;
    }

    public void setQuittime(Date quittime) {
        this.quittime = quittime;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }
}