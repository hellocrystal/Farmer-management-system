package com.njau.repo.mapper;

import com.njau.repo.pojo.FixDO;
import com.njau.repo.pojo.FixExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FixMapper {
    long countByExample(FixExample example);

    int deleteByExample(FixExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FixDO record);

    int insertSelective(FixDO record);

    List<FixDO> selectByExample(FixExample example);

    FixDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FixDO record, @Param("example") FixExample example);

    int updateByExample(@Param("record") FixDO record, @Param("example") FixExample example);

    int updateByPrimaryKeySelective(FixDO record);

    int updateByPrimaryKey(FixDO record);
}