package JavaMasterClass2020;

import java.util.Scanner;

public class BurgerMeal {

    private BurgerComponents drink;
    private BurgerComponents friPotatoes;

    final private BasicBurger accessBasicBurger = new BasicBurger();
    final private HealthyDeluxeBurger accessHealthyDeluxeBurger = new HealthyDeluxeBurger();

    public void MealOrder(boolean individualMeal) {
        System.out.println("What kind of burger do you want for your meal?");

        Scanner sc = new Scanner(System.in);

        String burgerChoice = "-1";
        while (!burgerChoice.equals("1") && !burgerChoice.equals("2") &&
                !burgerChoice.equals("3")) {
            System.out.println("Please choose - 1 - BasicBurger, 2 - HealthyDeluxeBurger" +
                    ", 3 - cancel order");
            burgerChoice = sc.nextLine();
        }

        switch (burgerChoice) {
            case "3":
                System.out.println("Thank you, your order is cancelled!");
                break;

            case "1":
                accessBasicBurger.BurgerOrder(individualMeal);
                drinkOrder();
                if (drink != null) {
                    friPotatoesOrder();

                    if (friPotatoes != null) {
                        System.out.println();
                        System.out.println("Your Basic burger meal is made!");
                        System.out.println();

                        accessBasicBurger.BurgerOrderMade();
                        accessBasicBurger.printOrderedComponent(drink);
                        accessBasicBurger.printOrderedComponent(friPotatoes);

                        System.out.println();

                        System.out.println("Total price: "
                                + accessBasicBurger.getPrice() + " EUR");
                        System.out.println();
                        System.out.println("Thank you! Bon appetite!");

                    } else {
                        System.out.println("Thank you, your order is cancelled!");
                    }

                } else {
                    System.out.println("Thank you, your order is cancelled!");
                }

                break;

            case "2":
                accessHealthyDeluxeBurger.BurgerOrder(individualMeal);
                drinkOrder();
                if (drink != null) {
                    friPotatoesOrder();

                    if (friPotatoes != null) {
                        System.out.println();
                        System.out.println("Your Healthy Deluxe burger meal is made!");
                        System.out.println();

                        accessHealthyDeluxeBurger.BurgerOrderMade();

                        accessBasicBurger.printOrderedComponent(drink);
                        accessBasicBurger.printOrderedComponent(friPotatoes);

                        System.out.println();

                        System.out.println("Total price: "
                                + (accessHealthyDeluxeBurger.getPrice()
                                + (accessBasicBurger.getPrice() / 2)) + " EUR");
                        System.out.println();
                        System.out.println("Thank you! Bon appetite!");

                    } else {
                        System.out.println("Thank you, your order is cancelled!");
                    }

                } else {
                    System.out.println("Thank you, your order is cancelled!");
                }

                break;

            default:
                System.out.println("Illegal operation!");
                break;
        }
    }


    public void drinkOrder() {
        int drinkChoice;

        final String DRINK_NO = "no drinks";
        final double DRINK_NO_PRICE = 0.0;

        final String DRINK_WATER = "water";
        final double DRINK_WATER_PRICE = 0.35;

        final String DRINK_JUICE = "juice";
        final double DRINK_JUICE_PRICE = 0.50;

        final String DRINK_SODA = "soda";
        final double DRINK_SODA_PRICE = 0.45;

        do {
            System.out.println("What do you want to drink?");
            System.out.println("0 - " + DRINK_NO
                    + ", 1 - " + DRINK_WATER + ", 2 - " + DRINK_JUICE
                    + ", 3 - " + DRINK_SODA + ", 4 - cancel order");

            drinkChoice = accessBasicBurger.entryValidation();

            if (drinkChoice == 4) {
                System.out.println("You have changed your mind? See you next time!");

            } else if (drinkChoice == 0) {
                this.drink = new BurgerComponents(DRINK_NO,
                        DRINK_NO_PRICE);
                accessBasicBurger.printOrderedComponent(drink);

            } else if (drinkChoice == 1) {
                this.drink = new BurgerComponents(DRINK_WATER, DRINK_WATER_PRICE);
                accessBasicBurger.printOrderedComponent(drink);

            } else if (drinkChoice == 2) {
                this.drink = new BurgerComponents(DRINK_JUICE, DRINK_JUICE_PRICE);
                accessBasicBurger.printOrderedComponent(drink);

            } else if (drinkChoice == 3) {
                this.drink = new BurgerComponents(DRINK_SODA,
                        DRINK_SODA_PRICE);
                accessBasicBurger.printOrderedComponent(drink);

            } else {
                System.out.println("Invalid entry! Try again!");
            }

        } while (drinkChoice != 0 && drinkChoice != 1
                && drinkChoice != 2 && drinkChoice != 3
                && drinkChoice != 4);
    }


    public void friPotatoesOrder() {
        int friPotatoesChoice;

        final String FRI_NO = "no fri potatoes";
        final double FRI_NO_PRICE = 0.0;

        final String FRI_SMALL = "small fri potatoes";
        final double FRI_SMALL_PRICE = 0.35;

        final String FRI_MEDIUM = "medium fri potatoes";
        final double FRI_MEDIUM_PRICE = 0.50;

        final String FRI_LARGE = "large fri potatoes";
        final double FRI_LARGE_PRICE = 0.75;

        do {
            System.out.println("Do you want fri potatoes?");
            System.out.println("0 - " + FRI_NO
                    + ", 1 - " + FRI_SMALL + ", 2 - " + FRI_MEDIUM
                    + ", 3 - " + FRI_LARGE + ", 4 - cancel order");

            friPotatoesChoice = accessBasicBurger.entryValidation();

            if (friPotatoesChoice == 4) {
                System.out.println("You have changed your mind? See you next time!");

            } else if (friPotatoesChoice == 0) {
                this.friPotatoes = new BurgerComponents(FRI_NO,
                        FRI_NO_PRICE);
                accessBasicBurger.printOrderedComponent(friPotatoes);

            } else if (friPotatoesChoice == 1) {
                this.friPotatoes = new BurgerComponents(FRI_SMALL, FRI_SMALL_PRICE);
                accessBasicBurger.printOrderedComponent(friPotatoes);

            } else if (friPotatoesChoice == 2) {
                this.friPotatoes = new BurgerComponents(FRI_MEDIUM, FRI_MEDIUM_PRICE);
                accessBasicBurger.printOrderedComponent(friPotatoes);

            } else if (friPotatoesChoice == 3) {
                this.friPotatoes = new BurgerComponents(FRI_LARGE,
                        FRI_LARGE_PRICE);
                accessBasicBurger.printOrderedComponent(friPotatoes);

            } else {
                System.out.println("Invalid entry! Try again!");
            }

        } while (friPotatoesChoice != 0 && friPotatoesChoice != 1
                && friPotatoesChoice != 2 && friPotatoesChoice != 3
                && friPotatoesChoice != 4);
    }

}
