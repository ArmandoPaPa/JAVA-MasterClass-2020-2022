package JavaMasterClass2020;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));

        System.out.println(getDurationString(3945));

        System.out.println(getDurationString(-41));

        System.out.println(getDurationString(65, 9));

    }

    private static String getDurationString(int minutes, int seconds) {
        String stringHours;
        String stringMin;
        String stringSec;

        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            if (hours >= 0 && hours <= 9) {
                stringHours = "0" + hours;
            } else {
                stringHours = String.valueOf(hours);
            }

            if (remainingMinutes >= 0 && remainingMinutes <= 9) {
                stringMin = "0" + remainingMinutes;
            } else {
                stringMin = String.valueOf(remainingMinutes);
            }

            if (seconds >= 0 && seconds <= 9) {
                stringSec = "0" + seconds;
            } else {
                stringSec = String.valueOf(seconds);
            }

            return stringHours + "h " + stringMin + "m " + stringSec + "s";

        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    private static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSec = seconds % 60;
            return getDurationString(minutes, remainingSec);

        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }
    
}
