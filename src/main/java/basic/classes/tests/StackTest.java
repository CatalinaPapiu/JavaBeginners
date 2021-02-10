package basic.classes.tests;

import basic.classes.model.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StackTest {
    @Test(description = "", testName = "")
    public void verifyStack() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.isEmpty(), "Stack expected to be empty, but it was not!");
        stack.push("Ana");
        Assert.assertFalse(stack.isEmpty(), "Stack expected to not be empty after first push, but it was!");
        stack.push("are");
        Assert.assertFalse(stack.isEmpty(), "Stack expected to not be empty after second push, but it was!");
        stack.push("mere!");

        String peek = stack.peek();
        Assert.assertEquals(peek, "mere!", "Peek method returned unexpected value: " + peek);

        String firstPop = stack.pop();
        Assert.assertEquals(firstPop, "mere!", "Pop method returned unexpected value: " + firstPop);

        String secondPop = stack.pop();
        Assert.assertEquals(secondPop, "are", "Pop method returned unexpected value: " + secondPop);

        stack.push("push test");

        String thirdPop = stack.pop();
        Assert.assertEquals(thirdPop, "push test", "Pop method returned unexpected value: " + thirdPop);

        String forthPop = stack.pop();
        Assert.assertEquals(forthPop, "Ana", "Pop method returned unexpected value: " + forthPop);

        String fifthPop = stack.pop();
        Assert.assertNull(fifthPop, "Null value was expected for pop operation on empty stack, but not found!");
    }
}
