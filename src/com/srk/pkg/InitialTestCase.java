package com.srk.pkg;

import static org.junit.Assert.*;
import com.sk.pak.MyCl;

import org.junit.Before;
import org.junit.Test;

public class InitialTestCase {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testDoGetHttpServletRequestHttpServletResponse() {
		int area = 150;
		assertEquals(150, area);
	}
	@Test
	public void testSayHello()
	{
		MyCl obj = new MyCl();
		String str = obj.sayHello();
		assertEquals("Hello World",str);
	}
}
