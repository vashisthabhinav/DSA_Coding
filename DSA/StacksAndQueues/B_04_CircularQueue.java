package DSA.StacksAndQueues;

public class B_04_CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;//Initially
    protected int front = 0;//Initially
    protected int size = 0;
    public B_04_CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public B_04_CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    public boolean insert(int item){
        if (isFull()) return false;
        data[end++] = item;
        end = end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }
    public void display(){
        if (isEmpty()) System.out.println("Is empty");
        int i = front;
        do {
            System.out.print(data[i++]+" <- ");
             i %= data.length;
        }while(i!=end);
        System.out.println("END");
    }
}