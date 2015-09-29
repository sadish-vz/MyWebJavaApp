package Test;

import static org.junit.Assert.*;

import itsfor.testing.ForTesting;

import org.junit.Before;
import org.junit.Test;

public class MyFirstTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		ForTesting obj = new ForTesting();
		String str = obj.sayHello();
		assertEquals("Hello World",str);
	}

}
