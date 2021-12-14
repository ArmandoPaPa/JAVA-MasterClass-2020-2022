package JavaMasterClass2021;

import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(6);
        // Gearbox.Gear first = mcLaren.new Gear(1,12.3);
        // - works with public inner Class but the code was update to private inner Class
        // System.out.println(first.driveSpeed(1000));
        // - see the comment above!

        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4); - wrong way!

        // Gearbox.Gear third = new mcLaren.Gear(3,17.8); - wrong way!

        // mcLaren.addGear(1,5.3); - code changed - for loop in Gearbox class
        // mcLaren.addGear(2,10.6);
        // mcLaren.addGear(3,15.9);

        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        System.out.println("-----------------------------");

        /*
            LOCAL CLASS

            class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }

        btnPrint.setOnClickListener(new ClickListener());

         */


        // Anonymous CLASS below

        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();


    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }

}
