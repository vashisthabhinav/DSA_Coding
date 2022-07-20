package DSA.GFG;

import java.util.ArrayList;

public class GFG_01_MaxNum {
    public static void main(String[] args) {
        System.out.println(maximumNumber(79997));
    }
    public static int maximumNumber(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        while(num>0){
            int digit = num%10;
            list.add(digit);
            num/=10;
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            if (list.get(i)==7) {
                list.set(i,9);
                break;
            }
        }
        int ans = 0;
        int place = 0;
        for (int i = 0; i < list.size(); i++) {
            ans += list.get(i)*Math.pow(10,place++);
        }
        return ans;
    }
}
