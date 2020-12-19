public class NumberPalindrome {


    public static boolean isPalindrome(int number) {

        int givenNumber = number;
        int reverseNumber = 0;

        if (number > -10 && number < 10) {
            return true;
        } else {
            while (number != 0) {
                reverseNumber += number % 10;
                reverseNumber *= 10;
                number /= 10;
            }
            reverseNumber /= 10;
        }

        if (givenNumber == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
}
