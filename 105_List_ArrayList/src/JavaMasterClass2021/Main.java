package JavaMasterClass2021;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("\nEnter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

    }

    private static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = sc.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is NOT FOUND in our grocery list");
        }
    }

    private static void removeItem() {
        System.out.print("Enter item name: ");
        String itemName = sc.nextLine();
        groceryList.removeGroceryItem(itemName);
    }

    private static void modifyItem() {
        System.out.print("Enter item name to modify: ");
        String itemToModify = sc.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = sc.nextLine();
        groceryList.modifyGroceryItem(itemToModify, newItem);
    }

    private static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(sc.nextLine());
    }

    private static void printInstructions() {
        System.out.print("\nPress ");
        System.out.print("\n 0 - To print choice options.");
        System.out.print("\n 1 - To print the list of grocery items.");
        System.out.print("\n 2 - To add an item to the list.");
        System.out.print("\n 3 - To modify an item in the list.");
        System.out.print("\n 4 - To remove an item from the list.");
        System.out.print("\n 5 - To search for an item in the list.");
        System.out.print("\n 6 - To quit the application.");
    }
}
