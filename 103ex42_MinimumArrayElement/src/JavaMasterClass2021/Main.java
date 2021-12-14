package JavaMasterClass2021;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("array min value = " + findMin(readElements(readInteger())));

    }


    private static int readInteger() {
        Scanner sc = new Scanner(System.in);

        System.out.println("readInteger() is called");
        System.out.println("Enter array length!");

        return sc.nextInt();
    }


    private static int[] readElements(int arrayLength) {

        int[] array = new int[arrayLength];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("readElements() is called");
            System.out.print("Enter element " + i + "   ");
            array[i] = sc.nextInt();
        }

        System.out.println("array = " + Arrays.toString(array));

        sc.close();

        return array;
    }


    private static int findMin(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }


}
