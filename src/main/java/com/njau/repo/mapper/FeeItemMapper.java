package com.njau.repo.mapper;

import com.njau.repo.pojo.FeeItemDO;
import com.njau.repo.pojo.FeeItemExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FeeItemMapper {
    long countByExample(FeeItemExample example);

    int deleteByExample(FeeItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeeItemDO record);

    int insertSelective(FeeItemDO record);

    List<FeeItemDO> selectByExample(FeeItemExample example);

    FeeItemDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeeItemDO record, @Param("example") FeeItemExample example);

    int updateByExample(@Param("record") FeeItemDO record, @Param("example") FeeItemExample example);

    int updateByPrimaryKeySelective(FeeItemDO record);

    int updateByPrimaryKey(FeeItemDO record);
}