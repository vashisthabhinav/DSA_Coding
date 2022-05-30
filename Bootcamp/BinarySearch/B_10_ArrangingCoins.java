package Bootcamp.BinarySearch;

public class B_10_ArrangingCoins {
    // Q441 LeetCode
    public static void main(String[] args) {
        int n = 1804289383;
        System.out.println(arrangeCoins(n));
        System.out.println(arrangeCoins1(n));
    }
    public static int arrangeCoins(int n) {
        //Brute Force Method
        int completeRows = 0;
        int i = 1;
        while (n >= i) {//Adding the coins row-wise, 1 in first row, 2 in second and so on
            n = n-i;
            i++;
            completeRows++;
        }
        return completeRows;
    }

    public static int arrangeCoins1(int n) {
        //n(n+1)/2
        long start = 0, end = n;
        while (start<=end){
            long mid = start + (end-start)/2;
            long current = (mid*(mid+1))/2;
            if (current==n) return (int) mid;
            else if (current<n) start = mid + 1;
            else end = mid - 1;
        }
        return (int)end;
    }
}
