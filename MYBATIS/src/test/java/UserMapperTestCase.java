import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.mybatis.entity.User;
import cn.tedu.mybatis.mapper.UserMapper;

public class UserMapperTestCase {
	
	private AbstractApplicationContext ac;
	private UserMapper userMapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		userMapper = ac.getBean("userMapper", UserMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}

	@Test
	public void insert() {
		User user = new User();
		user.setUsername("wo");
		user.setPassword("1234");
		user.setAge(31);
		user.setPhone("1390013");
		user.setEmail("namespace");
		System.out.println("输出前："+user);
		Integer rows = userMapper.insert(user);
		System.out.println("rows=" + rows);
		System.out.println("输出后："+user);
	}
	
	@Test
	public void findAll() {
		List<User> users = userMapper.findAll();
		System.out.println("BEGIN:");
		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("END.");
	}
	
	@Test
	public void findByUsername() {
		String username = "fds";
		User user 
			= userMapper.findByUsername(username);
		System.out.println(user);
	}
	@Test
	public void updatePasswordByAge() {
		String password="11111";
		Integer age=30;
		Integer rows=userMapper.updatePasswordByAge(age,password);
		System.out.println("rows:"+rows);
	}
}





