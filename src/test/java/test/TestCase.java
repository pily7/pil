package test;

import java.util.List;
import java.util.Map;

import org.apache.catalina.core.ApplicationContext;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import look.product.entity.Project;
import look.product.service.ProjectService;



public class TestCase {

	ClassPathXmlApplicationContext ac ;
	@Before
	public void init(){
		ac = new ClassPathXmlApplicationContext("spring-mvc.xml","spring-mybatis.xml");
	}
	
	@Test
	public void testFindObjects(){
		//1.获取业务对象
		ProjectService ps = ac.getBean("projectService", ProjectService.class);
		//2.调用业务对象方法		
		Map<String,Object> projects = ps.findPageObjects("f", 1);
		System.out.println("projects"+projects);
		
		
	/*	//3.测试结果是否正确
		Assert.assertNotEquals(null, projects);
		//当前表中数据总计有3条，检测数据是否都取到了
		Assert.assertEquals(3, projects.size());
		System.out.println(projects);*/
	}	
	
	@Test
	public void loginObject(){
		ProjectService ps = ac.getBean("projectService", ProjectService.class);
		Project p = ps.findByUname("001", "1234");
		System.out.println(p);
		
	}
	
	@Test
	public void singObject(){
		ProjectService ps = ac.getBean("projectService", ProjectService.class);
		Project p = new Project();
		p.setUname("005");
		p.setPassword("1234");
		ps.save(p);
		System.out.println("ok");	
	}
	
	@Test
	public void updateObject(){
		ProjectService ps = ac.getBean("projectService", ProjectService.class);
		Project p = ps.findObjectById("u22");
		System.out.println(p);
		p.setPassword("123456");
		ps.updateObject(p);
		System.out.println("ok");	
	}
	

	@After
	public void destroy(){
		ac.close();
	}
}
