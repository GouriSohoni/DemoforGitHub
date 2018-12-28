
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestValidator {

	@Test
	public void test() {
		 Boolean actual, expected=true;
		    Validator val = new Validator();
		    actual = val.Validate("Gouri", "Sohoni");
		    assertEquals(expected,actual);
	}

}
