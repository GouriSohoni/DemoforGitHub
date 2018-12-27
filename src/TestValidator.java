import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
class TestValidator {

	@Test
	void test() {
		 Boolean actual, expected=true;
		    Validator val = new Validator();
		    actual = val.Validate("Gouri", "Sohoni");
		    assertEquals(expected,actual);
	}

}
