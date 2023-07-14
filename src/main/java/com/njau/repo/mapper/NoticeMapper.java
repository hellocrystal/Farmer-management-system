package com.njau.repo.mapper;

import com.njau.repo.pojo.NoticeDO;
import com.njau.repo.pojo.NoticeExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface NoticeMapper {
    long countByExample(NoticeExample example);

    int deleteByExample(NoticeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NoticeDO record);

    int insertSelective(NoticeDO record);

    List<NoticeDO> selectByExample(NoticeExample example);

    NoticeDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NoticeDO record, @Param("example") NoticeExample example);

    int updateByExample(@Param("record") NoticeDO record, @Param("example") NoticeExample example);

    int updateByPrimaryKeySelective(NoticeDO record);

    int updateByPrimaryKey(NoticeDO record);
}