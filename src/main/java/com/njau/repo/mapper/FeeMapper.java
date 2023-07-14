package com.njau.repo.mapper;

import com.njau.repo.pojo.FeeDO;
import com.njau.repo.pojo.FeeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface FeeMapper {
    long countByExample(FeeExample example);

    int deleteByExample(FeeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeeDO record);

    int insertSelective(FeeDO record);

    List<FeeDO> selectByExample(FeeExample example);

    FeeDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeeDO record, @Param("example") FeeExample example);

    int updateByExample(@Param("record") FeeDO record, @Param("example") FeeExample example);

    int updateByPrimaryKeySelective(FeeDO record);

    int updateByPrimaryKey(FeeDO record);

    @Select("select * from fee where id = #{id}")
    FeeDO selectByFeeId(@Param("id")Integer id);

    @Update("update fee set state = #{state} where id = #{id}")
    int setStateByFeeId(@Param("state")Byte state, @Param("id")Integer id);
}