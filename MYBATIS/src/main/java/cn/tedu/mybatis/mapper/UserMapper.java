package cn.tedu.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.mybatis.entity.User;

public interface UserMapper {
 
	Integer insert(User user);
	List<User> findAll();
	User findByUsername(String username);
	Integer updatePasswordByAge(@Param("age") Integer a1,
			@Param("password") String a2);

}
