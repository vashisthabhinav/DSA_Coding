package Beginner.BinarySearch;


public class BS_01_BinarySearch3 {
    public int search(int[] nums, int target) {
        return searchResult(nums,0,nums.length-1,target);
    }
    public static int searchResult(int[] nums, int start, int end, int key){
        int mid=(start+end)/2;
        int toReturn=0;
        if(start==end){
            if(nums[start]==key)
                return start;
            else
                return -1;
        }
        else if(key<=nums[mid]){
            toReturn=searchResult(nums,start,mid,key);
        }
        else if(key>nums[mid]){
            toReturn=searchResult(nums,mid+1,end,key);
        }
        return toReturn;
    }
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(searchResult(nums,0,nums.length,9));
    }
}
