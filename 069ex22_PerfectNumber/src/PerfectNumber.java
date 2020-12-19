public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        int perfectNumber = 0;
        if (number < 1) {
            return false;
        } else {
            for (int i = 1; i < number; i++) {
                if (number % i == 0 && perfectNumber <= number) {
                    perfectNumber += i;
                    if (perfectNumber == number) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
