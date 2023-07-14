package com.njau.repo.mapper;

import com.njau.domain.vo.CarportVO;
import com.njau.repo.pojo.CarportDO;
import com.njau.repo.pojo.CarportDOKey;
import com.njau.repo.pojo.CarportExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarportMapper {
    long countByExample(CarportExample example);

    int deleteByExample(CarportExample example);

    int deleteByPrimaryKey(CarportDOKey key);

    int insert(CarportDO record);

    int insertSelective(CarportDO record);

    List<CarportDO> selectByExample(CarportExample example);

    CarportDO selectByPrimaryKey(CarportDOKey key);

    int updateByExampleSelective(@Param("record") CarportDO record, @Param("example") CarportExample example);

    int updateByExample(@Param("record") CarportDO record, @Param("example") CarportExample example);

    int updateByPrimaryKeySelective(CarportDO record);

    int updateByPrimaryKey(CarportDO record);

    List<CarportVO> findCarportByZoneByState(@Param("state") Byte state, @Param("zoneId") String zoneId);
}