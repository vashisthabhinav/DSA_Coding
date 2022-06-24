package DSA.StacksAndQueues;


public class B_03_StackMain {
    public static void main(String[] args) throws B_03_StackException{
        B_03_DynamicStack stack = new B_03_DynamicStack(5);

        stack.push(34);
        stack.push(23);
        stack.push(45);
        stack.push(89);
        stack.push(21);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());
    }
}
