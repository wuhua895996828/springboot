package com.woody.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.woody.dao.mapper.UserMapper;
import com.woody.domain.User;

@Mapper
public interface UserDao extends UserMapper {

	@Select("select * from user")
	List<User> getUsers();

	@Select("SELECT * FROM user u WHERE u.username=#{username}")
	User getByUsername(@Param("username") String username);

	@Select("SELECT roleName FROM role WHERE id = #{id} ")
	String getRoleName(@Param("id") Long id);

}
