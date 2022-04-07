package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from db1.tb_user where username= #{username} and password=#{password};commit;")
    User select(@Param("username") String username,@Param("password") String password);

    @Select("select * from db1.tb_user where username=#{username};")
    User selectUser(@Param("username") String username);

    @Insert("insert into db1.tb_user values (null,#{username},#{password})")
    void add(User user);

}
