package JavaMasterClass2021;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

    /*
    public String toString (String title, double duration){
        return title + ": " + duration;
    }

     */
}
