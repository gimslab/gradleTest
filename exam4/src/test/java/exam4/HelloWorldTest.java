package exam4;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldTest {
	
	@Test
	public void hello(){
		String expected = new HelloWorld().hello("Kim");
		assertThat(expected, is("안녕 Kim"));
	}

}
