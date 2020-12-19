package JavaMasterClass2020;

public class Main {

    public static void main(String[] args) {

        int value = 1;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 4;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was 3, 4, or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char switchChar = 'E';
        switch (switchChar){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("A, B, C, D or E was not found");
                break;
        }

        String month = "June";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Your month was January");
                break;
            case "february":
                System.out.println("Your month was February");
                break;
            case "march": case "april": case "may": case "june": case "july": case "august":
            case "september": case "october": case "november": case "december":
                System.out.println("Your month was " + month);
        }
    }
}
