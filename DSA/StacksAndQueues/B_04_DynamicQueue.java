package DSA.StacksAndQueues;

public class B_04_DynamicQueue extends B_04_CircularQueue{
    public B_04_DynamicQueue() {
        super();//It will call CustomQueue()
    }

    public B_04_DynamicQueue(int size) {
        super();//It will call CustomQueue(int size)
    }

    @Override
    public boolean insert(int item) {
        // This if statement takes care of it being full
        if (this.isFull()){
            //Double the array size
            int[] temp = new int[data.length*2];

            //Copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i)% data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        //Insert the item
        return super.insert(item);//Now we know that that array is not full
        //So, we can simply use the push of the CustomQueue
    }
}
