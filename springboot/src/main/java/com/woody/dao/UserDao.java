package com.woody.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.woody.dao.mapper.UserMapper;
import com.woody.domain.User;

@Mapper
public interface UserDao extends UserMapper {

	@Select("select * from user")
	List<User> getUsers();

}
