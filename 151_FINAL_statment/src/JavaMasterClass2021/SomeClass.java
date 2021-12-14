package JavaMasterClass2021;

public class SomeClass {

    //private final int instanceNumber = 1; // - cannot be changed anywhere else
    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        // instanceNumber = 1; - instanceNumber is final, cannot be changed here - see comment above
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
