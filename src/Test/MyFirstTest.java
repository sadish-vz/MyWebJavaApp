package Test;

import static org.junit.Assert.*;

import com.sk.pak.MyCl;

import org.junit.Before;
import org.junit.Test;

public class MyFirstTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		MyCl obj = new MyCl();
		String str = obj.sayHello();
		assertEquals("Hello World",str);
	}

}
