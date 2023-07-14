package com.njau.repo.mapper;

import com.njau.repo.pojo.DepartmentDO;
import com.njau.repo.pojo.DepartmentExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    long countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(Integer dno);

    int insert(DepartmentDO record);

    int insertSelective(DepartmentDO record);

    List<DepartmentDO> selectByExample(DepartmentExample example);

    DepartmentDO selectByPrimaryKey(Integer dno);

    int updateByExampleSelective(@Param("record") DepartmentDO record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") DepartmentDO record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(DepartmentDO record);

    int updateByPrimaryKey(DepartmentDO record);
}