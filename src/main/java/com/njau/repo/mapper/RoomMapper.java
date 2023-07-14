package com.njau.repo.mapper;

import com.njau.repo.pojo.RoomDO;
import com.njau.repo.pojo.RoomDOKey;
import com.njau.repo.pojo.RoomExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.Date;
import java.util.List;

@Mapper
public interface RoomMapper {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(RoomDOKey key);


    int insert(RoomDO record);

    int insertSelective(RoomDO record);

    List<RoomDO> selectByExample(RoomExample example);

    RoomDO selectByPrimaryKey(RoomDOKey key);

    int updateByExampleSelective(@Param("record") RoomDO record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") RoomDO record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(RoomDO record);

    int updateByPrimaryKey(RoomDO record);

    @Update("update room set username = null, time = null where username =#{username}")
    void removeUser(@Param("username") String username);


    @Update("update room set username = #{username}, time = #{date} where zone =#{zone} and id = #{roomID}")
    void addUser(@Param("username")String username, @Param("date")Date date, @Param("zone")Integer zone, @Param("roomID")String roomID);
}