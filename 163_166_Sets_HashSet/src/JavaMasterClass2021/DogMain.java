package JavaMasterClass2021;

public class DogMain {

    public static void main(String[] args) {

        // continues Challenge answer

        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        System.out.println(rover2.equals(rover)); //true
        System.out.println(rover.equals(rover2)); //false

        // to get true / true in both cases - do not Override in Labrador class
    }
}
