public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // big = 5
        // small = 1
        // goal
        int theRest = 0;
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            if ((goal - (bigCount * 5)) == 0) {
                return true;
            } else if ((goal - (bigCount * 5)) < 0) {
                while ((goal - (bigCount * 5)) < 0) {
                    bigCount -= 1;
                }
                theRest = goal - (bigCount * 5);
                if (theRest <= smallCount) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if ((goal - (bigCount * 5)) <= smallCount) {
                    return true;
                } else {
                    return false;
                }
            }
        }
    }
}
