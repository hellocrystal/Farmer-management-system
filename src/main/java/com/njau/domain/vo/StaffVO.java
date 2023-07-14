package com.njau.domain.vo;

import java.util.Date;

/**
 * StaffVO
 *
 * @since 2022/04/20.
 */
public class StaffVO {


    private String username;

    private String password;

    private String name;

    private String sex;

    private Byte age;

    private String phone;

    private String idcard;
    private Integer dno;

    private Date officetime;

    private Date quittime;

    private Integer salary;

    private Integer bonus;

    private String department;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
