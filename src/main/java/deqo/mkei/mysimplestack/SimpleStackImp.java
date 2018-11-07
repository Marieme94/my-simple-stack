package deqo.mkei.mysimplestack;

import java.util.EmptyStackException;
import java.util.Stack;

public  class SimpleStackImp implements SimpleStack{
    /**
     *
     */
    private Stack<Object> stack;
    private Item item;

    public SimpleStackImp() {
        stack = new Stack<Object>();
    }


    public boolean isEmpty() {
        return stack.isEmpty();
    }


    public int getSize() {
        return stack.size();
    }


    public void push(Item item) {
        stack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item)stack.peek();
    }


    public Item pop() throws EmptyStackException {
        return (Item) stack.pop();
    }
}
