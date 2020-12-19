public class LargestPrime {

    public static int getLargestPrime(int number) {
        int largestPrime = -1;

        for (int i = 2; i <= number; i++) {

            if (number % i == 0) {
                largestPrime = i;
                number /= i;
                i--;
            }
        }

        return largestPrime;
    }
}







/*
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

*/
