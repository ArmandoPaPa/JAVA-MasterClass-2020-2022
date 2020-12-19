package JavaMasterClass2020;

public class Printer {
    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else if (tonerLevel < 0) {
            this.tonerLevel = 0;
        } else {
            this.tonerLevel = 100;
        }
        this.numberOfPagesPrinted = 0;
        this.duplex = duplex;
    }

    public void fillUpToner(int fillUp) {
        System.out.println("Current tonerLevel is " + getTonerLevel() + " % and you want to fillUp "
                + fillUp + " %");
        if (fillUp >= 0) {
            if (this.tonerLevel + fillUp > 100) {
                this.tonerLevel = 100;
                System.out.println("Toner filled to max " + getTonerLevel() + " %");
            } else {
                this.tonerLevel += fillUp;
                System.out.println("Current tonerLevel is " + getTonerLevel() + " %");
            }
        } else {
            System.out.println("Invalid Operation");
            System.out.println("Current tonerLevel is " + getTonerLevel() + " %");
        }
    }

    public void print(int numberOfPagesPrinted) {
        System.out.println("You want to print " + numberOfPagesPrinted + " pages with duplex: "
                + isDuplex());
        if (numberOfPagesPrinted > 0 && (getTonerLevel() - (numberOfPagesPrinted * 0.05)) >= 0) {
            if (isDuplex()) {
                System.out.println("Current tonerLevel is " + getTonerLevel() + " %");
                this.numberOfPagesPrinted += (numberOfPagesPrinted / 2) + (numberOfPagesPrinted % 2);
                this.tonerLevel -= (numberOfPagesPrinted * 0.05);
                System.out.println("Number of pages printed = " + getNumberOfPagesPrinted());
                System.out.println("Current tonerLevel is " + getTonerLevel() + " %");
            } else {
                System.out.println("Current tonerLevel is " + getTonerLevel() + " %");
                this.numberOfPagesPrinted += numberOfPagesPrinted;
                this.tonerLevel -= (numberOfPagesPrinted * 0.05);
                System.out.println("Number of pages printed = " + getNumberOfPagesPrinted());
                System.out.println("Current tonerLevel is " + getTonerLevel() + " %");
            }
        } else {
            System.out.println("Not enough toner OR Invalid Operation");
        }
    }

    private double getTonerLevel() {
        return tonerLevel;
    }

    private int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    private boolean isDuplex() {
        return duplex;
    }
}
