package Bootcamp.Sorting;

public class B_07_AverageSalary {
    public static void main(String[] args) {
        int [] salary = {4000,3000,1000,2000,5000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        //Q1491
        //First sorting the array
        for (int i = 0; i < salary.length ; i++) {
            for (int j = 1; j < salary.length - i ; j++) {
                if (salary[j-1] > salary[j]){
                    int temp = salary[j];
                    salary[j] = salary[j-1];
                    salary[j-1] = temp;
                }
            }
        }
        double sum = 0;//Then calculating the sum
        for (int i = 1; i < salary.length-1 ; i++) {
            sum +=salary[i];
        }
        return  sum/(salary.length-2);//Then returning the average
    }
}
