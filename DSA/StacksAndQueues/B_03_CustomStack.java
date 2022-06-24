package DSA.StacksAndQueues;

public class B_03_CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int pointer = -1;//Initially

    public B_03_CustomStack() {
        this(DEFAULT_SIZE);
    }

    public B_03_CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        data[++pointer] = item;
        return true;
    }
    public int pop() throws B_03_StackException {
        if (isEmpty()){
            throw new B_03_StackException("Cannot pop through an empty stack");
        }
        return data[pointer--];
    }

    public int peek() throws B_03_StackException{
        if (isEmpty()){
            throw new B_03_StackException("Cannot peek through an empty stack");
        }
        return data[pointer];
    }

    public boolean isFull(){
        return pointer == data.length-1;
    }

    public boolean isEmpty(){
        return pointer == -1;
    }
}
