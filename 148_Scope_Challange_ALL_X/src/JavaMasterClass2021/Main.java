package JavaMasterClass2021;

import java.util.Scanner;

public class Main {

    // do not do this way in real code - here we use everywhere 'X' to learn scope

    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter a number: ");
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
