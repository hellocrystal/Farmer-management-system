package com.njau.repo.mapper;

import com.njau.domain.vo.UserBillVO;
import com.njau.domain.vo.RoomUserVO;
import com.njau.repo.pojo.UserDO;
import com.njau.repo.pojo.UserExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String username);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserExample example);

    UserDO selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);
    List<UserBillVO> unpayfy();


    List<RoomUserVO> findByZone(@Param("zone") Integer zone);
}