package JavaMasterClass2021;

public class Dog {

    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public final boolean equals(Object obj) {
        // make final to make sure the method will not be Overridden
        if (this == obj){
            return true;
        }
        if (obj instanceof Dog){
            String objName = ((Dog)obj).getName();
            return this.name.equals(objName);
        }
        return false;
    }
}
