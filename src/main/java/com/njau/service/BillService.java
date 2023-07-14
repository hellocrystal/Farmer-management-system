package com.njau.service;

import com.njau.domain.vo.UserBillVO;
import com.njau.repo.pojo.UserDO;

import java.util.List;

/**
 * BillService
 *
 * @since 2022/04/19.
 */
public interface BillService {

    UserBillVO findUserBillByUsername(UserDO user);

    UserBillVO findUserBillByUsernameAndStatus(UserDO user, String status);

    /**
     * 查询有未支付账单的用户
     * @return 有未支付账单的用户
     */
    List<UserBillVO> listUnPayUser();
}
