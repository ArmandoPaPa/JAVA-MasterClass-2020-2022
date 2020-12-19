package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("int MIN value = " + myMinIntValue);
        System.out.println("int MAX value = " + myMaxIntValue);

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte MIN value = " + myMinByteValue);
        System.out.println("Byte MAX value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("short MIN value = " + myMinShortValue);
        System.out.println("short MAX value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("long MIN value = " + myMinLongValue);
        System.out.println("long MAX value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        short myNewShortValue = (short) (myMinShortValue / 2);


        // Challenge by Tim

        byte chByte = 10;
        short chShort = 20;
        int chInt = 50;
        long chLong = 50000L + (10L * (chByte + chShort + chInt));

        System.out.println("Challenge RESULT = " + chLong);

        short shortTotal = (short) (1000 + 10 *
                (chByte + chShort + chInt));

        System.out.println("Challenge SHORT = " + shortTotal);

    }
}
