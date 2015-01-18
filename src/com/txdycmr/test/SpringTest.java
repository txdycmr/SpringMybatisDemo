package com.txdycmr.test;

import junit.framework.TestCase;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.txdycmr.model.User;
import com.txdycmr.service.inter.IUserService;

public class SpringTest extends TestCase {
	@Test
	public void testSpring(){
	    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");	
		IUserService userService = (IUserService) applicationContext.getBean("userService");
		User user = userService.findById(1);
		System.out.println(user.getName());
	}
}
