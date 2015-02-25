package dcll.sgad;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;

/**
 * Created by seb on 25/02/15.
 */
public class SimpleStackTest {

    @Test
    public void testCreateEmptyStack() { // Test case

        // Code under test
        SimpleStack stack = new MySimpleStack();

        // Assertions (oracle)
        Assert.assertTrue("A new stack should be empty", stack.isEmpty());
        Assert.assertEquals("A new stack has no element", 0, stack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException {

        // Setup the "state of the world"
        SimpleStack stack = new MySimpleStack();
        Item item = new Item();

        // Code under test
        stack.push(item);

        // assertions (oracle)
        Assert.assertFalse("The stack must be not empty", stack.isEmpty());
        Assert.assertEquals("The stack constains 1 item", 1, stack.getSize());
        Assert.assertSame("The pushed item is on top of the stack", item, stack.peek());
    }


    @Test(expected = EmptyStackException.class)
    public void testPopOnEmptyStack()  throws EmptyStackException {
        // Setup the "state of the world"
        SimpleStack stack = new MySimpleStack();

        // Code under test
        stack.pop(); // should throws an EmptyStackException.
    }


    @Test
    public void testPop() throws EmptyStackException {
        // Setup the "state of the world"
        SimpleStack stack = new MySimpleStack();
        Item item = new Item();
        Item itemRetrieve;
        stack.push(item);

        // Code under test
        itemRetrieve = stack.pop();

        // assertions (oracle)
        Assert.assertTrue("The stack must be empty", stack.isEmpty());
        Assert.assertEquals("The stack constains 0 item", 0, stack.getSize());
        Assert.assertEquals("The item retrieve is the one on top of the stack", item, itemRetrieve);
    }


}
