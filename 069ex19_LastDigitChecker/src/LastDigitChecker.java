public class LastDigitChecker {

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        if (isValid(numberOne) && isValid(numberTwo) && isValid(numberThree) &&
                (((numberOne % 10) == (numberTwo % 10)) ||
                        ((numberOne % 10) == (numberThree % 10)) ||
                        ((numberTwo % 10) == (numberThree % 10)))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid(int number) {
        if (number < 10 || number > 1000){
            return false;
        } else {
            return true;
        }
    }
}
