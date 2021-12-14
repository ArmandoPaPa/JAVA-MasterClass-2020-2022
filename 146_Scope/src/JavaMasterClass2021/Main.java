package JavaMasterClass2021;

public class Main {

    public static void main(String[] args) {

        String varFour = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();

        scopeInstance.useInner();

        System.out.println("-------------------------");

        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        System.out.println(varFour);

        scopeInstance.timesTwo();

        System.out.println("-------------------------");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();

        System.out.println("-------------------------");
        //ScopeCheck.InnerClass innerClass1 = scopeInstance.new InnerClass();
        //System.out.println("varThree is not accessible here " + innerClass1.varThree);
        // - private vs public variable & SCOPE!

        
    }
}
