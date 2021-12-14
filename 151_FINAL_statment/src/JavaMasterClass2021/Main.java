package JavaMasterClass2021;

public class Main {

    public static void main //extends Math - Math class is final
    (String[] args) {

        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // one.instanceNumber = 4;

        System.out.println("------------------------");

        System.out.println(Math.PI);

        //Math m = new Math(); // Math is final in Java

        System.out.println("------------------------");

        int pw = 674312;
        /*
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);


         */
        System.out.println("------------------------");

        Password password = new ExtendedPassword(pw);  // - changed security of password!
        // ... see ExtendedPassword... worked Overwritten Method until the method got final
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);


        System.out.println("------------------------");

        System.out.println("------------------------");

        // Static Initializers - SIBTest!

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is " + SIBTest.owner);


    }
}
