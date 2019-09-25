package com.hey.Hello_world;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	public HelloWorldApplication helloworld;
	@Test
	public void test() {
		String s=helloworld.home();
		assertEquals(s,"Hello World");
	}

}
