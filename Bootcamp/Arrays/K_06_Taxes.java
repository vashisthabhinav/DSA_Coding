package Bootcamp.Arrays;

public class K_06_Taxes {
    public static void main(String[] args) {
        int [][] nums = {{2,7},{3,17},{4,37},{7,6},{9,83},{16,67},{19,29}};
        int income = 18;
        System.out.println(calculateTax(nums,income));
    }
    public static double calculateTax(int[][] brackets, int income) {
        double taxes = 0;
        if (income==0) return 0;
        double range = brackets[0][0];
        if (income>=range){
            double taxPercent = range * brackets[0][1] / 100;
            taxes +=taxPercent;
            income -= range;
        }else if (income>0){
            double inc = income;
            double taxPercent = inc * brackets[0][1] / 100;
            taxes +=taxPercent;
            return taxes;
        }
        for (int i = 1; i < brackets.length ; i++) {
             range = brackets[i][0] -brackets[i-1][0];
            if (income>=range){
                double taxPercent = range * brackets[i][1] / 100;
                taxes +=taxPercent;
                income -= range;
            }else if (income>0){
                double inc = income;
                double taxPercent = inc * brackets[i][1] / 100;
                taxes +=taxPercent;
                income=0;
            }
        }
        return taxes;
    }
}
