package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        /*

        Player player = new Player();
        player.name = "Maria"; // problem if you change name in the other class
        // player.health = 20; // problem if you forget something
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.health = 200; // problem if someone adds something inappropriate
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        */

        EnhancedPlayer player = new EnhancedPlayer("Kate", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
