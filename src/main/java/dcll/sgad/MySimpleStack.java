package dcll.sgad;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by seb on 25/02/15.
 */
public class MySimpleStack implements SimpleStack {

    ArrayList<Item> stack = new ArrayList<Item>();

    @Override
    public boolean isEmpty() {
        if (stack.isEmpty())
            return true;
        return false;
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return stack.get(stack.size() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(stack.isEmpty())
            throw new EmptyStackException();
        Item item = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return item;
    }

    @Override
    public Item peekBot() throws EmptyStackException {
        return stack.get(0);
    }
}
