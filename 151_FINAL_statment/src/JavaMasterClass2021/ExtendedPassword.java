package JavaMasterClass2021;

public class ExtendedPassword extends Password {

    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

    /*
    @Override
    public void storePassword() { // - the method is final!
        System.out.println("Saving password as " + this.decryptedPassword);;
    }
     */


}
