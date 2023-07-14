package com.njau.service;

import com.njau.domain.vo.CarportVO;
import com.njau.repo.pojo.CarportDO;
import com.njau.repo.pojo.RoomDO;

import java.util.List;

/**
 * CarportService
 *
 * @since 2022/04/21.
 */
public interface CarportService {
    List<CarportDO> findByArea(String area);

    List<CarportDO> findByState(String status);

    List<CarportDO> findByUsername(String username);

    void deleteByRoom(RoomDO room);
    List<CarportVO> findCarportByArea(String zone);

    List<CarportVO> findCarportByState(Byte state);

    List<CarportVO> findCarport();
}
