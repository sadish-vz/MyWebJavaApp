package helloWorld;

import static org.junit.Assert.*;

/*import itsfor.testing.ForTesting;*/
import org.junit.Test;

public class MyFirstTest {


	@Test
	public void test() {
		/*ForTesting obj = new ForTesting();
		String str = obj.sayHello();*/
		assertEquals("Hello Wold","Hello World");
	}

}
