package com.twimi.documentmanager.Dao;

import com.twimi.documentmanager.Model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("Select * From user")
    List<User> getAllUsers();

    @Select("Select * From user Where username=#{username}")
    User getUserByUsername(@Param("username") String username);

    @Insert("Insert Into user(username,email,password) values (#{username},#{email},#{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);
}
