package com.njau.domain.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserRegisterRequest
 *
 * @since 2022/04/20.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterRequest {

    private String username;
    private String oname;
    private String opass;
    private String pass2;
    private String otel;
    private Integer towernum;
    private String odoorplate;
    private String oidentity;
    private Byte oage;
    private String osex;
}
