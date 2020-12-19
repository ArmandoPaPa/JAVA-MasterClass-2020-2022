package JavaMasterClass2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("You will need to enter numbers, once you enter not number, program exits");
        while (true) {
            System.out.print("Enter number   ");
            boolean validNumber = sc.hasNextInt();
            if (validNumber) {
                int enteredNumber = sc.nextInt();

                if (enteredNumber < min) {
                    min = enteredNumber;
                }
                if (enteredNumber > max) {
                    max = enteredNumber;
                }
            } else {
                break;
            }
            sc.nextLine(); // handle input (enter key)
        }

        sc.close();

        if (min == Integer.MAX_VALUE && max == Integer.MIN_VALUE){
            System.out.println("You have not entered any valid number!");
        } else {
            System.out.println("min entered number = " + min);
            System.out.println("MAX entered number = " + max);
        }
    }
}
