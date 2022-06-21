package DSA.BinarySearch;

public class B_19_Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        int start = 1 , end = x;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<=x/mid && (mid+1)>x/(mid+1)){
                end = mid;
                break;
            }else if(mid > x/mid){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }
}
