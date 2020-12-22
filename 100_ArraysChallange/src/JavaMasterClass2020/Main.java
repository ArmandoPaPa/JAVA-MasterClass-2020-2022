package JavaMasterClass2020;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] unsortedArray = getIntegers(5);
        printArray(unsortedArray);

        printArray(sortIntegers(unsortedArray));

    }

    public static int[] getIntegers(int capacity) {
        System.out.println("Enter " + capacity + " numbers for Array \r");
        int[] array = new int[capacity];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    /* ONE SORTING SOLUTION

    public static int[] sortIntegers(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp;
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
     */

    // ALTERNATIVE SORTING SOLUTION

    public static int[] sortIntegers(int[] array) {

        /* COPY ARRAY with LOOP

        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
         */

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }


    public static void printArray(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println(" ]");
    }

}
