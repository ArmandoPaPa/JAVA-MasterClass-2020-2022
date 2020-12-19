public class SharedDigit {

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {
        int givenNumberTwo = numberTwo;
        if (numberOne < 10 || numberOne > 99 || numberTwo < 10 || numberTwo > 99) {
            return false;
        } else {
            while (numberOne > 0) {
                int numberOneLastDigits = numberOne % 10;
                while (numberTwo > 0) {
                    int numberTwoLastDigits = numberTwo % 10;
                    if (numberOneLastDigits == numberTwoLastDigits) {
                        return true;
                    }
                    numberTwo /= 10;
                }
                numberOne /= 10;
                numberTwo = givenNumberTwo;
            }
        }
        return false;
    }
}
