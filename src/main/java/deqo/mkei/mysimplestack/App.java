package deqo.mkei.mysimplestack;

import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Stack<String> STACK = new Stack<String>();
        STACK.push("This");
        STACK.push("is");
        STACK.push("a");
        STACK.push("simple");
        STACK.push("stack");
        STACK.push("program");

        System.out.println("Initial Stack: " + STACK);

        System.out.println("The element at the top of the"
                + " stack is: " + STACK.peek());

        System.out.println("Final Stack: " + STACK);

    }
}
