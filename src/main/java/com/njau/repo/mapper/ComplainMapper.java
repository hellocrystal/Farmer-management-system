package com.njau.repo.mapper;

import com.njau.domain.vo.ComplainVO;
import com.njau.repo.pojo.ComplainDO;
import com.njau.repo.pojo.ComplainExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

@Mapper
public interface ComplainMapper {
    long countByExample(ComplainExample example);

    int deleteByExample(ComplainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComplainDO record);

    int insertSelective(ComplainDO record);

    List<ComplainDO> selectByExample(ComplainExample example);

    ComplainDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComplainDO record, @Param("example") ComplainExample example);

    int updateByExample(@Param("record") ComplainDO record, @Param("example") ComplainExample example);

    int updateByPrimaryKeySelective(ComplainDO record);

    int updateByPrimaryKey(ComplainDO record);

    @Update("update complain set state = 1, handle_time = #{handleTime}, staff_username = #{staffUsername} where id = #{id}")
    int setStateAndTimeById(@Param("id") Integer id, @Param("staffUsername") String staffUsername, @Param("handleTime") Date handleTime);

    List<ComplainVO> xSql(@Param("username") String username,@Param("state") Byte state);
}