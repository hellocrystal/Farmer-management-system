package com.njau.domain.vo;

import java.util.List;

/**
 * UserBillVO
 *
 * @since 2022/04/20.
 */
public class UserBillVO {

    private String username;
    private String name;
    private String phone;
    private Integer total;
    private List<BillVO> bill;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<BillVO> getBill() {
        return bill;
    }

    public void setBill(List<BillVO> bill) {
        this.bill = bill;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
