import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int counter = 0;

        System.out.println("You will need to enter number! Once you enter not number, program exits");
        while (true) {
            boolean validNumber = sc.hasNextInt();
            if (validNumber) {
                int number = sc.nextInt();
                sum += number;
                counter += 1;
                average = Math.round((double) sum / counter);
            } else {
                break;
            }
            sc.nextLine();
        }
        sc.close();

        System.out.println("SUM = " + sum + " AVG = " + average);
    }
}
