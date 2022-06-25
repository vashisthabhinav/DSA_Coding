package DSA.HackerRank;

public class H_14_CountingValleys {
    public static void main(String[] args) {
        int steps = 12;
        String path = "DDUUDDUDUUUD";
        System.out.println(countingValleys(steps,path));
    }
    public static int countingValleys(int steps, String path) {
        //Test cases failed
        /*
        int valleys = 0;

        int level = 0;
        for(int i = 0 ; i < steps ; i++){
            if(path.charAt(i)=='U')level++;
            else level--;
            if(level<0){
                int j = i+1;
                int next = level;
                while(next!=0 && j<steps){
                    if(path.charAt(j)=='U')next++;
                    else next--;
                    j++;
                }
                i = j;
                level = next;
                valleys++;
            }
        }
        return valleys;

         */
        int valleys = 0 , level = 0 ;
        for (int i = 0; i < steps; i++) {
            if (path.charAt(i)=='U'){
                level++;
                if (level==0) valleys++;
            }
            else if (path.charAt(i)=='D'){
                level--;
            }
        }
        return valleys;
    }
}
