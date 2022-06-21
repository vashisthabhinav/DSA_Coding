package DSA.Arrays;

public class K_02_04A_RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        /*
        You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has.
        A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
         */
        int wealth = 0;// Maximum wealth that will be returned
        for (int i = 0; i <accounts.length ; i++) { //For ith customer
            int customerWealth = 0;
            for (int j = 0; j <accounts[i].length ; j++) {//Checking his/her jth bank
                customerWealth += accounts[i][j]; // Adding its total wealth
            }
            if (customerWealth>=wealth){//This will give maximum wealth
                wealth = customerWealth;
            }
        }
        return wealth;
    }
    public static void main(String[] args) {
        int [][] nums = {{2,8,7},{7,1,3},{1,9,5}};
//        for (int i = 0; i <nums.length ; i++) {
//            for (int j = 0; j <nums[i].length ; j++) {
//            System.out.print(nums[i][j] + "\t");
//            }
//        }

        System.out.println(maximumWealth(nums));
    }
}
