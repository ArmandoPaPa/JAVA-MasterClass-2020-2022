public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {

            int reversedNumber = reverse(number);
            while (reversedNumber > 0) {
                int reversedNumberLastDigit = reversedNumber % 10;
                switch (reversedNumberLastDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        break;
                }
                reversedNumber /= 10;
            }
            int diffZeros = getDigitCount(number) - getDigitCount(reverse(number));
            for (int i = 0; i < diffZeros; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            reversedNumber += number % 10;
            number /= 10;
            reversedNumber *= 10;
        }
        reversedNumber /= 10;
        return reversedNumber;
    }

    public static int getDigitCount(int number) {
        int counter = 0;
        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        } else {
            while (number != 0) {
                counter++;
                number /= 10;
            }
            return counter;
        }
    }
}
