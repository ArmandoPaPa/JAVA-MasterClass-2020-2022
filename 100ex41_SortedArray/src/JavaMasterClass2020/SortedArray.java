package JavaMasterClass2020;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


    public static int[] getIntegers(int size) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Please, fill array with " + size + " numbers\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    public static int[] sortIntegers(int[] array) {
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
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

}
