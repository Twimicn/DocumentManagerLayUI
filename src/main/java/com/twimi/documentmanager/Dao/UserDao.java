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

    @Insert("INSERT INTO user(username,password,role,name,sex,birthday,address,contact,referrer,industryid,committeeid) VALUES (#{username},#{password},#{role},#{name},#{sex},#{birthday},#{address},#{contact},#{referrer},#{industryid},#{committeeid})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert(User user);
}
