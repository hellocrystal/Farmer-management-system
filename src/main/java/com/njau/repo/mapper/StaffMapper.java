package com.njau.repo.mapper;

import com.njau.repo.pojo.StaffDO;
import com.njau.repo.pojo.StaffExample;
import com.njau.repo.pojo.StaffView;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper //使用了@mapper 标记这是一个映射接口
public interface StaffMapper {
    long countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(String username);

    int insert(StaffDO record);

    int insertSelective(StaffDO record);

    List<StaffDO> selectByExample(StaffExample example);

    StaffDO selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") StaffDO record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") StaffDO record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(StaffDO record);

    int updateByPrimaryKey(StaffDO record);

    List<StaffView> selectAll();
}