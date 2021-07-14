import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner input = new Scanner(System.in);
        double count = 0;
        double sum = 0;

        while(true) {
            boolean hasNextInt = input.hasNextInt();
            if(hasNextInt) {
                int num = input.nextInt();
                sum += num;
                count++;

            } else {
                if(count == 0 ) {
                    System.out.println("SUM = " + 0 + " AVG = " + 0);
                } else {
                    double avg = Math.round((sum / count));
                    System.out.println("SUM = " + (int) sum + " AVG = " + (int) avg ) ;
                }
                break;
            }
        }
    }
}
