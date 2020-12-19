public class PositiveNegativeZero {

    public static void main(String[] args) {

        checkNumber(-432);
    }

    public static void checkNumber (int number){
        if (number > 0){
            System.out.println("positive");
        } else if (number == 0){
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }

}
