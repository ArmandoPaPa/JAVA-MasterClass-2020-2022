package JavaMasterClass2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.print("Enter number #" + counter + "   ");
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt){
                sum += sc.nextInt();
                sc.nextLine(); // handle end of line (enter key)
                counter++;
            } else {
                System.out.println("Invalid number");
                sc.nextLine(); // handle end of line (enter key)
            }
        }
        sc.close();

        System.out.println("Sum of your entered numbers = " + sum);
    }
}
