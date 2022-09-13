package com.example.demo.mapper;

import com.example.demo.dto.userDto;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface userMapper {

    @Select("SELECT * FROM member WHERE id=${id}")
    userDto getUserDto(@Param("id") String id);

    @Select("SELECT * FROM member")
    List<userDto> getUserDtoAll();

    @Insert("INSERT INTO member(id,name,phone,address) VALUES(#{id}, #{name}, #{phone}, #{address})")
    int putUserDto(@Param("id") String id, @Param("name") String name, @Param("phone") String phone, @Param("address") String address);

    @Delete("DELETE FROM member WHERE id=${id}")
    int delUserDto(@Param("id") String id);
}
