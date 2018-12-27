import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestValidator {

	@Test
	void test() {
		 Boolean actual, expected=true;
		    MyClass val = new MyClass();
		    actual = val.Validate("Gouri", "Sohoni");
		    assertEquals(expected,actual);
	}

}
