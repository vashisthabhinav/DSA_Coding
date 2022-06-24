package DSA.StacksAndQueues;

public class B_03_DynamicStack extends B_03_CustomStack{
    public B_03_DynamicStack() {
        super();//It will call CustomStack()
    }

    public B_03_DynamicStack(int size) {
        super();//It will call CustomStack(int size)
    }

    @Override
    public boolean push(int item) {
        // This if statement takes care of it being full
        if (this.isFull()){
            //Double the array size
            int[] temp = new int[data.length*2];

            //Copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //Insert the item
        return super.push(item);//Now we know that that array is not full
        //So, we can simply use the push of the CustomStack
    }
}
