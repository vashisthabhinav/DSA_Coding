package Beginner.BinarySearch;
import java.util.Scanner;
public class BS_01_BinarySearch1 {
    public static int search(int [] nums,int first, int last, int toCheck) {
        int index = 0;
        int mid = (first + last) / 2;

        if (nums[mid] == toCheck) {
            index = mid;
            return index;
        } else if (nums[mid] > toCheck && toCheck >= nums[first]) {
            //Target should be less than the biggest number

            return search(nums, first, mid, toCheck);
        } else if (nums[mid] < toCheck && toCheck < nums[last]) {
            //Target should be less than the biggest number
            return search(nums, mid + 1, last, toCheck);
        } else return -1;
    }
    public static void main(String[] args) {
        int nums[]= {-1,0,3,5,9,12};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number whose index has to be checked: ");
        int toCheck= sc.nextInt();
        System.out.print("The index of this number is: ");
        System.out.println(search(nums,0,nums.length-1,toCheck));

    }
}
