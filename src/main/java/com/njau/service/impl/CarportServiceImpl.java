package com.njau.service.impl;

import com.njau.domain.vo.CarportVO;
import com.njau.repo.mapper.CarportMapper;
import com.njau.repo.pojo.CarportDO;
import com.njau.repo.pojo.CarportExample;
import com.njau.repo.pojo.RoomDO;
import com.njau.service.CarportService;
import com.njau.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CarportServiceImpl
 *
 * @since 2022/04/21.
 */
@Service
public class CarportServiceImpl implements CarportService {

    @Autowired
    private CarportMapper carportMapper;
    @Autowired
    private RoomService roomService;

    @Override
    public List<CarportDO> findByArea(String area) {
        CarportExample example = new CarportExample();
        example.createCriteria().andZoneIdEqualTo(area);
        return carportMapper.selectByExample(example);
    }

    @Override
    public List<CarportDO> findByState(String status) {
        CarportExample example = new CarportExample();
        example.createCriteria().andStateEqualTo(Byte.valueOf(status));
        return carportMapper.selectByExample(example);
    }

    @Override
    public List<CarportDO> findByUsername(String username) {
        RoomDO room = roomService.findByUsername(username);
        CarportExample example = new CarportExample();
        example.createCriteria().andRoomZoneEqualTo(room.getZone()).andRoomIdEqualTo(room.getId());
        return carportMapper.selectByExample(example);
    }

    @Override
    public void deleteByRoom(RoomDO room) {

        CarportExample example = new CarportExample();
        example.createCriteria().andRoomIdEqualTo(room.getId()).andRoomZoneEqualTo(room.getZone());

        CarportDO carportDO = new CarportDO();
        carportDO.setRoomZone(null);
        carportDO.setRoomId(null);
        carportDO.setBuytime(null);
        carportDO.setState(Byte.valueOf("0"));
        carportMapper.updateByExampleSelective(carportDO, example);
    }

    @Override
    public List<CarportVO> findCarportByArea(String zone) {
        return carportMapper.findCarportByZoneByState(null, zone);
    }

    @Override
    public List<CarportVO> findCarportByState(Byte state) {
        return carportMapper.findCarportByZoneByState(state, null);
    }

    @Override
    public List<CarportVO> findCarport() {
        return carportMapper.findCarportByZoneByState(null, null);
    }
}
