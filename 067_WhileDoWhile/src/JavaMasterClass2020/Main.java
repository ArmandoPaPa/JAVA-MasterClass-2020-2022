package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("----------");

        for (count = 1; count != 6; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println("----------");

        count = 1;
        while (true) {
            if (count == 6) {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("----------");

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("----------");

        System.out.println(isEvenNumber(2));

        System.out.println("----------");

        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
        }

        System.out.println("----------");

        number = 4;
        finishNumber = 20;
        int counter = 0;
        int sum = 0;
        while (number <= finishNumber && counter != 5) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            sum += number;
            counter++;
        }
        System.out.println(counter + " even number sum = " + sum);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
