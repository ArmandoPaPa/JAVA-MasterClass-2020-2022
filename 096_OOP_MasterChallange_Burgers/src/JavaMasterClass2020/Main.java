package JavaMasterClass2020;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Dear Friend! Welcome to our burger house!");
        System.out.println();
        System.out.println("You can choose the following:");
        System.out.println();
        System.out.println("1 - standard Basic burger (predefined)");
        System.out.println("2 - individual Basic burger (you choose components)");
        System.out.println("3 - standard Healthy Deluxe burger (predefined)");
        System.out.println("4 - individual Healthy Deluxe burger (you choose components)");
        System.out.println("5 - burger MEAL (burger predefined)");
        System.out.println("6 - cancel order");
        System.out.println();

        Scanner sc = new Scanner(System.in);

        String orderChoice = "-1";
        while (!orderChoice.equals("1") && !orderChoice.equals("2") &&
                !orderChoice.equals("3") && !orderChoice.equals("4") &&
                !orderChoice.equals("5") && !orderChoice.equals("6")) {
            System.out.println("Press 1, 2, 3, 4, 5 or 6");
            orderChoice = sc.nextLine();
        }

        switch (orderChoice) {
            case "1":
                new BasicBurger().basicBurgerOrder(false);
                break;
            case "2":
                new BasicBurger().basicBurgerOrder(true);
                break;
            case "3":
                new HealthyDeluxeBurger().HealthyDeluxeBurgerOrder(false);
                break;
            case "4":
                new HealthyDeluxeBurger().HealthyDeluxeBurgerOrder(true);
                break;
            case "5":
                new BurgerMeal().MealOrder(false);
                break;
            case "6":
                System.out.println("You have changed your mind! See you next time!");
                break;

            default:
                System.out.println("Illegal operation");
                break;
        }

        sc.close();


        //BasicBurger standardBurger = new BasicBurger();
        //standardBurger.basicBurgerOrder(false);
        //Wall wall1 = new Wall("West");

        //BurgerMeal testMeal = new BurgerMeal();
        //testMeal.drinkOrder();
        //testMeal.friPotatoesOrder();
        //testMeal.MealOrder(false);

        //BasicBurger testBurger = new BasicBurger();
        //testBurger.basicBurgerOrder(true);

        //HealthyDeluxeBurger testHealthy = new HealthyDeluxeBurger();
        //testHealthy.HealthyDeluxeBurgerOrder(false);

        //double test = 11.125456;

        //System.out.println((double)Math.round(test*100)/100);

    }
}
