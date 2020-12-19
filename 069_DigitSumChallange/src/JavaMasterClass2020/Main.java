package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));
    }

    private static long sumDigits (int number){
        long sum = 0;
        if (number < 10){
            return -1;
        } else {
            do{
                sum += number % 10;
                number = number / 10;
            } while (number > 0);
        }
        return sum;
    }
}
