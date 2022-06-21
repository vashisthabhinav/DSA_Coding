package DSA.BinarySearch;

public class B_12_IsBadVersion {
//    Q278
    public static void main(String[] args) {
        int n = 5, bad = 4;
        System.out.println(firstBadVersion(n,bad));
    }
    public static int firstBadVersion(int n, int bad) {
        //If we assume that versions are in a form of array with [0,1,2,3,.....,n]
        int start = 0, end = n, firstBadVersion = n;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid, bad)){//If the mid element is a badVersion it can be a possible answer
                firstBadVersion = mid;//So making the firstBadVersion as mid
                end = mid - 1;//But checking in the left part of the array for more possible bad versions
            }else{//If the mid element is not a bad version then the bad version may lie in the right side of the array
                start = mid+1;
            }
        }
        return firstBadVersion;
    }

    private static boolean isBadVersion(int mid, int bad) {//Being used in ide only as in the question there is an api instead
        if(mid>=bad){
            return true;
        }
        return false;
    }
}