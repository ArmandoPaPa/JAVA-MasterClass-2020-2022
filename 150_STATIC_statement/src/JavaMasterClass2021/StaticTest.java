package JavaMasterClass2021;

public class StaticTest {

    private static int numInstances = 0;  // - static added - only one instance exists in memory
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() { // - static added
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
