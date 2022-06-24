package DSA.HackerRank;

public class H_03_TimeConversion {
    public static void main(String[] args) {
        String s = "08:05:45PM";
        System.out.println(timeConversion(s));
    }
    public static String timeConversion(String s) {
        StringBuilder ans = new StringBuilder();
        String hours = s.substring(0,2);
        String am_pm = s.substring(8);
        String rest = s.substring(2,8);
        if(am_pm.equals("AM")){
            if (hours.equals("12")){
                ans.append("00");
            }else{
                ans.append(hours);
            }
        }
        if(am_pm.equals("PM")){
            if(hours.equals("12")){
                ans.append("12");
            }else{
                int i = Integer.parseInt(hours);
                i += 12;
                String convert = String.valueOf(i);
                ans.append(convert);
            }
        }
        ans.append(rest);
        return ans.toString();
    }
}
