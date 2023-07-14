package com.njau.repo.mapper;

import com.njau.repo.pojo.ManageCarportDO;
import com.njau.repo.pojo.ManageCarportDOKey;
import com.njau.repo.pojo.ManageCarportExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ManageCarportMapper {
    long countByExample(ManageCarportExample example);

    int deleteByExample(ManageCarportExample example);

    int deleteByPrimaryKey(ManageCarportDOKey key);

    int insert(ManageCarportDO record);

    int insertSelective(ManageCarportDO record);

    List<ManageCarportDO> selectByExample(ManageCarportExample example);

    ManageCarportDO selectByPrimaryKey(ManageCarportDOKey key);

    int updateByExampleSelective(@Param("record") ManageCarportDO record, @Param("example") ManageCarportExample example);

    int updateByExample(@Param("record") ManageCarportDO record, @Param("example") ManageCarportExample example);

    int updateByPrimaryKeySelective(ManageCarportDO record);

    int updateByPrimaryKey(ManageCarportDO record);
}