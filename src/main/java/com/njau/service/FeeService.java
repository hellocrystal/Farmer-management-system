package com.njau.service;

import com.njau.repo.pojo.FeeItemDO;
import com.njau.repo.pojo.RoomDO;

/**
 * FeeService
 *
 * @since 2022/04/23.
 */
public interface FeeService {
    void deleteByRoom(RoomDO room);

    void addFeeItem(String username, FeeItemDO billitem);

    Boolean payFee(Integer id);
}
