import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class ListTest {

	@Test
	public void successAdd() {
		Stack<String> stack = new Stack<>();

		stack.push("кот");
		stack.push("собака");

		assertEquals("собака", stack.pop());
		assertEquals("кот", stack.pop());
		assertNull(stack.pop());

	}

}