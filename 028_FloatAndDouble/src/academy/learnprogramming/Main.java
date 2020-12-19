package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float MIN value = " + myMinFloatValue);
        System.out.println("Float MAX value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double MIN value = " + myMinDoubleValue);
        System.out.println("Double MAX value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;  // or 5.25f OR (float) 5.25
        double myDoubleValue = 5.00 / 3.00; // or 5d / 3d
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

        double Pounds = 180d;
        double kgs = Pounds * 0.45359237d;
        System.out.println(Pounds + " Pounds to kgs = " + kgs);

        double pi = 3.1215927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);


    }
}
