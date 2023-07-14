package com.njau.repo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
//@TableName("sdu")
public class StaffView {
    private String username;
    private String password;
    private String name;
    private String sex;
    private String phone;
    private Date officetime;
    private Date quittime;
    private Integer salary;
    private Integer bonus;
    private String department;
}
