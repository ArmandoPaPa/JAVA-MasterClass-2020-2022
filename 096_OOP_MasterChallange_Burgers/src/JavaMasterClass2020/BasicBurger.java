package JavaMasterClass2020;

import java.util.Scanner;

public class BasicBurger {
    private BurgerComponents bread;
    private BurgerComponents meat;
    private BurgerComponents greens;
    private int numberOfGreens;
    private BurgerComponents tomato;
    private int numberOfTomatoes;
    private BurgerComponents cheese;
    private int numberOfCheese;
    private BurgerComponents sauce;
    private double price;
    private boolean cancelOrder;

    public boolean readyToContinue;


    public double getPrice() {
        return (double) Math.round(price * 100) / 100;
    }

    public void setBread(BurgerComponents bread) {
        this.bread = bread;
    }

    Scanner sc = new Scanner(System.in);

    public void basicBurgerOrder(boolean individualBurger) {
        BurgerOrder(individualBurger);
        if (readyToContinue) {
            System.out.println();
            System.out.println("Your basic Burger is made!");
            System.out.println();

            BurgerOrderMade();
            System.out.println("Total price: " + getPrice() + " EUR");
            System.out.println();
            System.out.println("Thank you! Bon appetite!");
        }
    }

    public void BurgerOrder(boolean individualBurger) {

        breadOrder(individualBurger);
        if (bread == null) {
            System.out.println("Your order is cancelled! See you next time!");
            this.cancelOrder = true;
        }

        if (!cancelOrder) {
            meatOrder(individualBurger);
            if (meat == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.cancelOrder = true;
            }
        }

        if (!cancelOrder) {
            greenOrder(individualBurger);
            if (greens == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.cancelOrder = true;
            }
        }

        if (!cancelOrder) {
            tomatoOrder(individualBurger);
            if (tomato == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.cancelOrder = true;
            }
        }

        if (!cancelOrder) {
            cheeseOrder(individualBurger);
            if (cheese == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.cancelOrder = true;
            }
        }

        if (!cancelOrder) {
            sauceOrder(individualBurger);
            if (sauce == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.cancelOrder = true;
            }
        }

        this.readyToContinue = !cancelOrder;
    }


    public void BurgerOrderMade() {
        this.price = 0;

        printOrderedComponent(bread);
        printOrderedComponent(meat);
        printOrderedComponent(greens, this.numberOfGreens);
        printOrderedComponent(tomato, this.numberOfTomatoes);
        printOrderedComponent(cheese, this.numberOfCheese);
        printOrderedComponent(sauce);
        System.out.println();
    }


    public void breadOrder(boolean individualBurger) {
        int breadType;

        final String WHITE_BREAD = "white bread";
        final double WHITE_BREAD_PRICE = 1.0;
        final String BROWN_BREAD = "brown bread";
        final double BROWN_BREAD_PRICE = 1.2;

        if (individualBurger) {
            do {
                System.out.println("What kind of bread do you want for your burger?");
                System.out.println("1 - " + WHITE_BREAD + ", 2 - " + BROWN_BREAD +
                        ", 3 - cancel order");
                breadType = entryValidation();
                if (breadType == 3) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (breadType == 1) {
                    this.bread = new BurgerComponents(WHITE_BREAD, WHITE_BREAD_PRICE);
                    printOrderedComponent(bread);
                    printSubtotal();

                } else if (breadType == 2) {
                    this.bread = new BurgerComponents(BROWN_BREAD, BROWN_BREAD_PRICE);
                    printOrderedComponent(bread);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (breadType != 1 && breadType != 2 && breadType != 3);
        } else {
            this.bread = new BurgerComponents(WHITE_BREAD, WHITE_BREAD_PRICE);
        }
    }


    private void meatOrder(boolean individualBurger) {
        int meatType;

        final String MEAT_BEEF = "beef meat";
        final double MEAT_BEEF_PRICE = 2.0;

        final String MEAT_CHICKEN = "chicken meat";
        final double MEAT_CHICKEN_PRICE = 1.2;

        final String MEAT_PORK = "pork meat";
        final double MEAT_PORK_PRICE = 1.4;

        final String MEAT_MIX = "mix meat";
        final double MEAT_MIX_PRICE = 2.0;

        if (individualBurger) {
            do {
                System.out.println("What kind of meat do you want for your burger?");
                System.out.println("1 - " + MEAT_BEEF + ", 2 - " + MEAT_CHICKEN
                        + ", 3 - " + MEAT_PORK + ", 4 - " + MEAT_MIX
                        + ", 5 - cancel order");
                meatType = entryValidation();
                if (meatType == 5) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (meatType == 1) {
                    this.meat = new BurgerComponents(MEAT_BEEF, MEAT_BEEF_PRICE);
                    printOrderedComponent(meat);
                    printSubtotal();

                } else if (meatType == 2) {
                    this.meat = new BurgerComponents(MEAT_CHICKEN, MEAT_CHICKEN_PRICE);
                    printOrderedComponent(meat);
                    printSubtotal();

                } else if (meatType == 3) {
                    this.meat = new BurgerComponents(MEAT_PORK, MEAT_PORK_PRICE);
                    printOrderedComponent(meat);
                    printSubtotal();

                } else if (meatType == 4) {
                    this.meat = new BurgerComponents(MEAT_MIX, MEAT_MIX_PRICE);
                    printOrderedComponent(meat);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (meatType != 1 && meatType != 2 && meatType != 3
                    && meatType != 4 && meatType != 5);
        } else {
            this.meat = new BurgerComponents(MEAT_MIX, MEAT_MIX_PRICE);
        }
    }


    private void greenOrder(boolean individualBurger) {
        this.numberOfGreens = -1;

        final String GREENS = "greens";
        final double GREENS_PRICE = 0.12;

        if (individualBurger) {
            do {
                System.out.println("How many " + GREENS + " do you want?");
                System.out.println("You can choose between 0 - 10 " + GREENS +
                        ". Write 11 - to cancel order");

                this.numberOfGreens = entryValidation();
                if (this.numberOfGreens == 11) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (this.numberOfGreens >= 0 && this.numberOfGreens <= 10) {
                    this.greens = new BurgerComponents(GREENS, GREENS_PRICE);
                    printOrderedComponent(greens, this.numberOfGreens);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (this.numberOfGreens < 0 || this.numberOfGreens > 11);
        } else {
            this.greens = new BurgerComponents(GREENS, GREENS_PRICE);
            this.numberOfGreens = 3;
        }
    }


    private void tomatoOrder(boolean individualBurger) {
        this.numberOfTomatoes = -1;

        final String TOMATO = "tomatoes";
        final double TOMATO_PRICE = 0.2;

        if (individualBurger) {
            do {
                System.out.println("How many " + TOMATO + " do you want?");
                System.out.println("You can choose between 0 - 5 " + TOMATO
                        + ". Write 6 - to cancel order");
                this.numberOfTomatoes = entryValidation();
                if (this.numberOfTomatoes == 6) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (this.numberOfTomatoes >= 0 && this.numberOfTomatoes <= 5) {
                    this.tomato = new BurgerComponents(TOMATO, TOMATO_PRICE);
                    printOrderedComponent(tomato, this.numberOfTomatoes);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (this.numberOfTomatoes < 0 || this.numberOfTomatoes > 6);
        } else {
            this.tomato = new BurgerComponents(TOMATO, TOMATO_PRICE);
            this.numberOfTomatoes = 2;
        }
    }


    private void cheeseOrder(boolean individualBurger) {
        this.numberOfCheese = -1;

        final String CHEESE = "cheese slices";
        final double CHEESE_PRICE = 0.25;

        if (individualBurger) {
            do {
                System.out.println("How many " + CHEESE + " do you want?");
                System.out.println("You can choose between 0 - 5 " + CHEESE
                        + ". Write 6 - to cancel order");
                this.numberOfCheese = entryValidation();
                if (this.numberOfCheese == 6) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (this.numberOfCheese >= 0 && this.numberOfCheese <= 5) {
                    this.cheese = new BurgerComponents(CHEESE, CHEESE_PRICE);
                    printOrderedComponent(cheese, this.numberOfCheese);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (this.numberOfCheese < 0 || this.numberOfCheese > 6);
        } else {
            this.cheese = new BurgerComponents(CHEESE, CHEESE_PRICE);
            this.numberOfCheese = 2;
        }
    }


    private void sauceOrder(boolean individualBurger) {
        int sauceType;

        final String SAUCE_KETCHUP = "ketchup sauce";
        final double SAUCE_KETCHUP_PRICE = 0.08;

        final String SAUCE_MAYO = "mayo sauce";
        final double SAUCE_MAYO_PRICE = 0.10;

        final String SAUCE_MIX = "mix sauce";
        final double SAUCE_MIX_PRICE = 0.15;

        if (individualBurger) {
            do {
                System.out.println("What kind of sauce do you want for your burger?");
                System.out.println("1 - " + SAUCE_KETCHUP + ", 2 - " + SAUCE_MAYO
                        + ", 3 - " + SAUCE_MIX + ", 4 - cancel order");
                sauceType = entryValidation();
                if (sauceType == 4) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (sauceType == 1) {
                    this.sauce = new BurgerComponents(SAUCE_KETCHUP, SAUCE_KETCHUP_PRICE);
                    printOrderedComponent(sauce);
                    printSubtotal();

                } else if (sauceType == 2) {
                    this.sauce = new BurgerComponents(SAUCE_MAYO, SAUCE_MAYO_PRICE);
                    printOrderedComponent(sauce);
                    printSubtotal();

                } else if (sauceType == 3) {
                    this.sauce = new BurgerComponents(SAUCE_MIX, SAUCE_MIX_PRICE);
                    printOrderedComponent(sauce);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (sauceType != 1 && sauceType != 2 && sauceType != 3 && sauceType != 4);
        } else {
            this.sauce = new BurgerComponents(SAUCE_MIX, SAUCE_MIX_PRICE);
        }
    }


    public int entryValidation() {
        boolean hasInt = sc.hasNextInt();
        if (hasInt) {
            int number = sc.nextInt();
            sc.nextLine();
            return number;
        } else {
            sc.nextLine();
            return -1;
        }
    }


    public void printOrderedComponent(BurgerComponents name) {
        System.out.println("Chosen type: " + name.getName()
                + ", price " + (double) Math.round(name.getPricePerUnit() * 100) / 100
                + " EUR");
        this.price += (double) Math.round(name.getPricePerUnit() * 100) / 100;
    }


    public void printOrderedComponent(BurgerComponents name, int numberOfUnits) {
        System.out.println("You have chosen " + numberOfUnits + " "
                + name.getName() + ", price per unit: "
                + (double) Math.round(name.getPricePerUnit() * 100) / 100
                + "; total price = "
                + (double) Math.round(name.getPricePerUnit()
                * numberOfUnits * 100) / 100
                + " EUR");
        this.price += (double) Math.round(name.getPricePerUnit()
                * numberOfUnits * 100) / 100;
    }


    public void printSubtotal() {
        System.out.println("Subtotal: " + getPrice() + " EUR");
    }

}