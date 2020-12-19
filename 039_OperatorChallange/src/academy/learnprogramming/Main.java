package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double doubleValueOne = 20.00d;
        double doubleValueTwo = 80.00d;

        double result = (doubleValueOne + doubleValueTwo) * 100.00d;
        System.out.println("result = " + result);

        double remainder = result % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean isRemainderZero = (remainder == 0) ? true : false;

        System.out.println("isRemainderZero - " + isRemainderZero);

        if (!isRemainderZero){
            System.out.println("Got some remainder - " + remainder);
        }
    }
}
