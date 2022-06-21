package DSA.Math;

public class B_14_CheckStraightLine {
    public static void main(String[] args) {
        int[][] coordinates = {{4,8},{-2,8},{1,8},{8,8},{-5,8},{0,8},{7,8},{5,8}};
        System.out.println(checkStraightLine(coordinates));
    }
    public static boolean checkStraightLine(int[][] coordinates) {
        boolean isStraightLine = true;
        if (coordinates.length == 2) return true;//As there are only two points, and they will always form straight line.
        double x1 = coordinates[0][0];
        double y1 = coordinates[0][1];
        double x2 = coordinates[1][0];
        double y2 = coordinates[1][1];
        double slope = (y2-y1)/(x2-x1);
        for (int i = 2; i <coordinates.length ; i++) {
            double x = coordinates[i][0];
            double y = coordinates[i][1];
            double currentSlope = (y-y1)/(x-x1);
            if (currentSlope != slope && (coordinates[i][0] != coordinates[0][0] || coordinates[i][0] != coordinates[1][0])){
                return false;
            }
        }
        return isStraightLine;
    }
}
