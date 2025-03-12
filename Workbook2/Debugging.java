package Workbook2;

public class Debugging {
    
    public static void main(String[] args) {
        
        double examScores1 = 85;
        double examScores2 = 90;
        double examScores3 = 95;

        int total = 100;

        double decimalScore1 = examScores1 / total;
        double decimalScore2 = examScores2 / total;
        double decimalScore3 = examScores3 / total;

        double decimalAverage = (decimalScore1 + decimalScore2 + decimalScore3) / 3.0;

        System.out.println("The average is " + decimalAverage );
    }
}