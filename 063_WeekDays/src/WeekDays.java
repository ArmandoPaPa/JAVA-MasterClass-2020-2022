public class WeekDays {

    public static void printDayOfTheWeek (int day){
        switch (day){
            case 1:
                System.out.println(day + " = Monday");
                break;
            case 2:
                System.out.println(day + " = Tuesday");
                break;
            case 3:
                System.out.println(day + " = Wednesday");
                break;
            case 4:
                System.out.println(day + " = Thursday");
                break;
            case 5:
                System.out.println(day + " = Friday");
                break;
            case 6:
                System.out.println(day + " = Saturday");
                break;
            case 7:
                System.out.println(day + " = Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printDayWithIfElse (int day){
        if (day == 1){
            System.out.println(day + " = Mon");
        } else if (day == 2){
            System.out.println(day + " = Tue");
        } else if (day == 3){
            System.out.println(day + " = Wed");
        } else if (day == 4){
            System.out.println(day + " = Thu");
        } else if (day == 5){
            System.out.println(day + " = Fri");
        } else if (day == 6){
            System.out.println(day + " = Sat");
        } else if (day == 7){
            System.out.println(day + " = Sun");
        } else {
            System.out.println("Invalid day");
        }
    }
}
