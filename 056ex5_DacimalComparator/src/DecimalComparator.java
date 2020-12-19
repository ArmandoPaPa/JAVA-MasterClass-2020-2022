public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double firstDouble, double secondDouble){
        int a = (int)(firstDouble * 1000);
        int b = (int)(secondDouble * 1000);


        if (a == b){
            return true;
        } else {
            return false;
        }
    }
}
