package cn.mldn.microboot.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.microboot.StartSpringBootMain;
import cn.mldn.microboot.service.IDeptService;

@SpringBootTest(classes=StartSpringBootMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestDeptSerive {
	
	@Resource
	private IDeptService deptService;
	
	@Test
	public void testList() throws Exception{
		System.out.println("ddddddddddddddddddddd");
		System.out.println(this.deptService.list());
	}

}
