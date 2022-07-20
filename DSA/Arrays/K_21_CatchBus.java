package DSA.Arrays;

import java.util.Arrays;

public class K_21_CatchBus {
    public static void main(String[] args) {
        int[] buses = {20,30,10};
        int[] passengers = {19,13,26,4,25,11,21};
        System.out.println(latestTimeCatchTheBus(buses,passengers,2));
    }
    public static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        int ans = 0;
        int j = 0;
        int m = passengers.length;
        int n = buses.length;
        int currCapacity = 0;
        for (int i = 0; i < n; i++) {
            int busTime = buses[i];
            while (j<m){
                if (passengers[j]<busTime && currCapacity<capacity){
                    ans = passengers[j] -1;
                    currCapacity++;
                    if (currCapacity<capacity){
                        currCapacity++;
                        j++;
                    }
                }else {
                    currCapacity = 0;
                    break;
                }
            }
        }
        return ans;
    }
}
