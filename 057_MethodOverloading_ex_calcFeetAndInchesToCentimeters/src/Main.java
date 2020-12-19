public class Main {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(8,4));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double cm = calcFeetAndInchesToCentimeters(12 * feet + inches);
            System.out.println(feet + " feet " + inches + " inches = " + cm + " cm");
            return cm;
        } else {
            System.out.println("Invalid feet and/or inches parameter");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            return inches * 2.54;
        } else {
            return -1;
        }
    }
}
