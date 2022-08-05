package DSA.Codeforces;

import java.util.Scanner;

public class CF_24_EveryoneLovesToSleep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t>0){
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();
            int[] hours = new int[n];
            int[] minutes = new int[n];
            for (int i = 0; i < n; i++) {
                hours[i] = sc.nextInt();
                minutes[i] = sc.nextInt();
            }
            int sleepingTime = (H * 60) + M;
            int ans  = 24*60 , minTime = 24*60;
            for (int i = 0; i < n; i++) {
                int alarmTime = (hours[i]*60) + (minutes[i]);
                if (hours[i]>H){
                    minTime = alarmTime - sleepingTime;
                }else if (hours[i]==H){
                    if (minutes[i]==M) minTime = 0;
                    else if(minutes[i]>M) minTime = minutes[i] - M;
                    else minTime = (1440 - sleepingTime)+ alarmTime;
                }else {
                    int timeTillNoon = 1440 - sleepingTime;
                    minTime = alarmTime + timeTillNoon;
                }
                ans = Math.min(ans,minTime);
            }
            int hr = ans/60;
            int min = ans%60;
            System.out.println(hr + " " + min);
            t--;
        }
    }
}
