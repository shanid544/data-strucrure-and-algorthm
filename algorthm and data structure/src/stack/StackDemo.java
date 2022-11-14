package stack;

public class StackDemo {

    public static void main(String[] args){
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(2);
        stack.push(43);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.top);
        stack.pop();
    }
}
