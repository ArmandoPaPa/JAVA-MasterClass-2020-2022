package JavaMasterClass2021;

public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch (boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }

    /*
    public void operateClutch (String inOrOut){
        this.clutchIsIn = inOrOut.equalsIgnoreCase("in");
    }
     */
}
