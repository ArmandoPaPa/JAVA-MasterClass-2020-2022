package JavaMasterClass2020;

public class HealthyDeluxeBurger extends BasicBurger {
    private BurgerComponents cucumber;
    private BurgerComponents bacon;
    private BurgerComponents avocadoOrMushrooms;
    boolean continueOrder;


    public void HealthyDeluxeBurgerOrder(boolean individualBurger) {
        BurgerOrder(individualBurger);
        if (continueOrder) {
            System.out.println();
            System.out.println("Your Healthy Deluxe BURGER is made!");
            System.out.println();

            BurgerOrderMade();
            System.out.println("Total price: " + getPrice() + " EUR");
            System.out.println();
            System.out.println("Thank you! Bon appetite!");
        }
    }


    @Override
    public void BurgerOrder(boolean individualBurger) {
        super.BurgerOrder(individualBurger);
        continueOrder = readyToContinue;

        if (continueOrder) {
            cucumberOrder(individualBurger);
            if (cucumber == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.continueOrder = false;
            }
        }

        if (continueOrder) {
            baconOrder(individualBurger);
            if (bacon == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.continueOrder = false;
            }
        }

        if (continueOrder) {
            avocadoOrMushroomsOrder(individualBurger);
            if (avocadoOrMushrooms == null) {
                System.out.println("Your order is cancelled! See you next time!");
                this.continueOrder = false;
            }
        }
    }


    @Override
    public void BurgerOrderMade() {
        super.BurgerOrderMade();
        printOrderedComponent(cucumber);
        printOrderedComponent(bacon);
        printOrderedComponent(avocadoOrMushrooms);
        System.out.println();
    }


    @Override
    public void breadOrder(boolean individualBurger) {
        int breadType;

        final String BREAD_NO = "no bread";
        final double BREAD_NO_PRICE = 0.0;

        final String BREAD_SEED_WHITE = "seed/white";
        final double BREAD_SEED_WHITE_PRICE = 1.4;

        final String BREAD_SEED_DARK = "seed/dark";
        final double BREAD_SEED_DARK_PRICE = 1.7;

        BurgerComponents healthyBreadOrNot;

        if (individualBurger) {
            do {
                System.out.println("What kind of bread do you want for your Healthy Deluxe burger?");
                System.out.println("0 - " + BREAD_NO + ", 1 - " + BREAD_SEED_WHITE
                        + ", 2 - " + BREAD_SEED_DARK + ", 3 - cancel order");
                breadType = entryValidation();

                if (breadType == 3) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (breadType == 0) {
                    healthyBreadOrNot = new BurgerComponents(BREAD_NO, BREAD_NO_PRICE);
                    printOrderedComponent(healthyBreadOrNot);
                    printSubtotal();
                    setBread(healthyBreadOrNot);

                } else if (breadType == 1) {
                    healthyBreadOrNot = new BurgerComponents(BREAD_SEED_WHITE,
                            BREAD_SEED_WHITE_PRICE);
                    printOrderedComponent(healthyBreadOrNot);
                    printSubtotal();
                    setBread(healthyBreadOrNot);

                } else if (breadType == 2) {
                    healthyBreadOrNot = new BurgerComponents(BREAD_SEED_DARK,
                            BREAD_SEED_DARK_PRICE);
                    printOrderedComponent(healthyBreadOrNot);
                    printSubtotal();
                    setBread(healthyBreadOrNot);

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (breadType != 0 && breadType != 1 && breadType != 2 && breadType != 3);
        } else {
            healthyBreadOrNot = new BurgerComponents(BREAD_SEED_WHITE,
                    BREAD_SEED_WHITE_PRICE);

            setBread(healthyBreadOrNot);
        }
    }


    private void cucumberOrder(boolean individualBurger) {
        int cucumberChoice;

        final String CUCUMBER_NO = "no cucumbers";
        final double CUCUMBER_NO_PRICE = 0.0;

        final String CUCUMBER_YES = "cucumbers";
        final double CUCUMBER_YES_PRICE = 0.13;

        final String CUCUMBER_MANY = "many cucumbers";
        final double CUCUMBER_MANY_PRICE = 0.69;

        if (individualBurger) {
            do {
                System.out.println("Do you want cucumbers in your burger?");
                System.out.println("0 - " + CUCUMBER_NO + ", 1 - " + CUCUMBER_YES
                        + ", 2 - " + CUCUMBER_MANY + ", 3 - cancel order");
                cucumberChoice = entryValidation();
                if (cucumberChoice == 3) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (cucumberChoice == 0) {
                    this.cucumber = new BurgerComponents(CUCUMBER_NO, CUCUMBER_NO_PRICE);
                    printOrderedComponent(cucumber);
                    printSubtotal();

                } else if (cucumberChoice == 1) {
                    this.cucumber = new BurgerComponents(CUCUMBER_YES, CUCUMBER_YES_PRICE);
                    printOrderedComponent(cucumber);
                    printSubtotal();

                } else if (cucumberChoice == 2) {
                    this.cucumber = new BurgerComponents(CUCUMBER_MANY, CUCUMBER_MANY_PRICE);
                    printOrderedComponent(cucumber);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (cucumberChoice != 0 && cucumberChoice != 1 && cucumberChoice != 2
                    && cucumberChoice != 3);
        } else {
            this.cucumber = new BurgerComponents(CUCUMBER_YES, CUCUMBER_YES_PRICE);
        }
    }


    private void baconOrder(boolean individualBurger) {
        int baconChoice;

        final String BACON_NO = "no bacon";
        final double BACON_NO_PRICE = 0.0;

        final String BACON_YES = "bacon";
        final double BACON_YES_PRICE = 0.55;

        final String BACON_MANY = "many bacon";
        final double BACON_MANY_PRICE = 0.99;

        if (individualBurger) {
            do {
                System.out.println("Do you want bacon in your burger?");
                System.out.println("0 - " + BACON_NO + ", 1 - " + BACON_YES
                        + ", 2 - " + BACON_MANY + ", 3 - cancel order");
                baconChoice = entryValidation();
                if (baconChoice == 3) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (baconChoice == 0) {
                    this.bacon = new BurgerComponents(BACON_NO, BACON_NO_PRICE);
                    printOrderedComponent(bacon);
                    printSubtotal();

                } else if (baconChoice == 1) {
                    this.bacon = new BurgerComponents(BACON_YES, BACON_YES_PRICE);
                    printOrderedComponent(bacon);
                    printSubtotal();

                } else if (baconChoice == 2) {
                    this.bacon = new BurgerComponents(BACON_MANY, BACON_MANY_PRICE);
                    printOrderedComponent(bacon);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (baconChoice != 0 && baconChoice != 1 && baconChoice != 2
                    && baconChoice != 3);
        } else {
            this.bacon = new BurgerComponents(BACON_YES, BACON_YES_PRICE);
        }
    }


    private void avocadoOrMushroomsOrder(boolean individualBurger) {
        int avocadoOrMushroomsChoice;

        final String AVOCADO_MUSHROOMS_NO = "no avocado, no mushrooms";
        final double AVOCADO_MUSHROOMS_NO_PRICE = 0.0;

        final String AVOCADO = "avocado";
        final double AVOCADO_PRICE = 0.77;

        final String MUSHROOMS = "mushrooms";
        final double MUSHROOMS_PRICE = 0.65;

        final String AVOCADO_MUSHROOMS_YES = "avocado and mushrooms";
        final double AVOCADO_MUSHROOMS_YES_PRICE = 1.44;

        if (individualBurger) {
            do {
                System.out.println("Do you want avocado OR mushrooms in your burger?");
                System.out.println("0 - " + AVOCADO_MUSHROOMS_NO
                        + ", 1 - " + AVOCADO + ", 2 - " + MUSHROOMS
                        + ", 3 - " + AVOCADO_MUSHROOMS_YES + ", 4 - cancel order");
                avocadoOrMushroomsChoice = entryValidation();
                if (avocadoOrMushroomsChoice == 4) {
                    System.out.println("Thank you, your order is cancelled");

                } else if (avocadoOrMushroomsChoice == 0) {
                    this.avocadoOrMushrooms = new BurgerComponents(AVOCADO_MUSHROOMS_NO,
                            AVOCADO_MUSHROOMS_NO_PRICE);
                    printOrderedComponent(avocadoOrMushrooms);
                    printSubtotal();

                } else if (avocadoOrMushroomsChoice == 1) {
                    this.avocadoOrMushrooms = new BurgerComponents(AVOCADO, AVOCADO_PRICE);
                    printOrderedComponent(avocadoOrMushrooms);
                    printSubtotal();

                } else if (avocadoOrMushroomsChoice == 2) {
                    this.avocadoOrMushrooms = new BurgerComponents(MUSHROOMS, MUSHROOMS_PRICE);
                    printOrderedComponent(avocadoOrMushrooms);
                    printSubtotal();

                } else if (avocadoOrMushroomsChoice == 3) {
                    this.avocadoOrMushrooms = new BurgerComponents(AVOCADO_MUSHROOMS_YES,
                            AVOCADO_MUSHROOMS_YES_PRICE);
                    printOrderedComponent(avocadoOrMushrooms);
                    printSubtotal();

                } else {
                    System.out.println("Invalid entry! Try again!");
                }

            } while (avocadoOrMushroomsChoice != 0 && avocadoOrMushroomsChoice != 1
                    && avocadoOrMushroomsChoice != 2 && avocadoOrMushroomsChoice != 3
                    && avocadoOrMushroomsChoice != 4);
        } else {
            this.avocadoOrMushrooms = new BurgerComponents(AVOCADO_MUSHROOMS_NO,
                    AVOCADO_MUSHROOMS_NO_PRICE);
        }
    }

}
