package DSA.Bitwise;

public class B_03_IthBit {
    public static void main(String[] args) {
        int number = 182;
        System.out.println(getIthBit(number,5));
        System.out.println(setIthBit(number,4));//Setting 0 to 1

    }
    public static int setIthBit(int number, int i) {
        int mask = 1<<(i-1);
        int ans =  number | mask;
        return ans;
    }

    public static int getIthBit(int number, int i) {
        //182 is 10110110 in binary
        int mask = 1<<(i-1);
        int ans =  number&mask;
        //To convert this ans into binary we have methods:
        String binary = Integer.toBinaryString(ans);//First converting the answer into binary string
        if (binary.length()==i){//16-->10000 length is 5 as the number
            return 1;
        }else{
            return 0;
        }
    }

}
