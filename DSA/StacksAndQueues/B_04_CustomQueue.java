package DSA.StacksAndQueues;

public class B_04_CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;//Initially
    public B_04_CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public B_04_CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isFull()) return false;
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception{
        //This will take O(N) time complexity as after removing the first element of the array,
        //we would have to shift all the elements to the right of the 0th index by 1 to their left

        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        //Shift the elements to the left
        for (int i = 1; i < end; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.println("END");
    }

}
