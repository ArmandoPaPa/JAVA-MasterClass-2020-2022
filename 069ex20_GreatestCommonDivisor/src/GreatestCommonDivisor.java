public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        } else {
            if (first > second) {
                for (int i = second; i > 0; i--) {
                    if (first % i == 0 && second % i == 0) {
                        return i;
                    }
                }
            } else {
                for (int i = first; i > 0; i--) {
                    if (first % i == 0 && second % i == 0) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
