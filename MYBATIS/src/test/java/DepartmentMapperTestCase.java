import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.tedu.mybatis.mapper.DepartmentMapper;
import cn.tedu.mybatis.vo.DepartmentVO;

public class DepartmentMapperTestCase {
	
	private AbstractApplicationContext ac;
	private DepartmentMapper departmentMapper;
	
	@Before
	public void doBefore() {
		ac = new ClassPathXmlApplicationContext("spring-dao.xml");
		departmentMapper = ac.getBean("departmentMapper", DepartmentMapper.class);
	}
	
	@After
	public void doAfter() {
		ac.close();
	}

	@Test
	public void findById() {
		Integer id=2;
		DepartmentVO departmentVo=departmentMapper.findById(id);
				System.out.println(departmentVo);
	}
//	@Test
//	public void findById() {
//		User user = new User();
//		user.setUsername("namespace");
//		user.setPassword("1234");
//		user.setAge(31);
//		user.setPhone(1390013);
//		user.setEmail("namespace@tedu.cn");
//		System.out.println("输出前："+user);
//		Integer rows = userMapper.insert(user);
//		System.out.println("rows=" + rows);
//		System.out.println("输出后："+user);
//	}
	
//	@Test
//	public void findAll() {
//		List<User> users = userMapper.findAll();
//		System.out.println("BEGIN:");
//		for (User user : users) {
//			System.out.println(user);
//		}
//		System.out.println("END.");
//	}
//	
//	@Test
//	public void findByUsername() {
//		String username = "mapper";
//		User user 
//			= userMapper.findByUsername(username);
//		System.out.println(user);
//	}
//	@Test
//	public void updatePasswordByAge() {
//		String password="88888888";
//		Integer age=30;
//		Integer rows=userMapper.updatePasswordByAge(age,password);
//		System.out.println("rows:"+rows);
//	}
}





