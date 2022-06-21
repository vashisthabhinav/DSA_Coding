package DSA.BinarySearch;

public class B_13_IsPerfectSquare {
    // Q367
    public static void main(String[] args) {
        int num = 15;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        long start = 0, end = num, mid, product;//Taking every number as long because 1 <= num <= 2^31 - 1
        while (start<=end){
            mid = start + (end - start)/2;
            product = (mid*mid);
            if (product==num){
                return true;
            }else if (product>num){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
