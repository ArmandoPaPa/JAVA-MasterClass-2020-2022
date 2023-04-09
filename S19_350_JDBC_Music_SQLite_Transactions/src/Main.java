import model.Artist;
import model.Datasource;
import model.SongArtist;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Datasource datasource = new Datasource();

        if (!datasource.open()) {
            System.out.println("Can't open datasource");
            return;
        }

        List<Artist> artists = datasource.queryArtists(Datasource.ORDER_BY_ASC);
        if (artists == null) {
            System.out.println("No artists!");
            return;
        }

        for (Artist artist : artists) {
            System.out.println("ID = " + artist.getId() + ", Name = " + artist.getName());
        }

        System.out.println("------------------------------------------");

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_ASC);

        for (String album : albumsForArtist) {
            System.out.println(album);
        }

        System.out.println("------------------------------------------");

        List<SongArtist> songArtists = datasource.queryArtistsForSong("Go Your Own Way",
                Datasource.ORDER_BY_ASC);

        if (songArtists == null) {
            System.out.println("Couldn't find the artist for the song!");
            return;
        }

        for (SongArtist artist : songArtists) {
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }


        System.out.println("------------------------------------------");

        datasource.querySongsMetadata();


        System.out.println("------------------------------------------");

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println("Number of songs is: " + count);


        System.out.println("------------------------------------------");

        datasource.createViewForSongArtists();


        System.out.println("------------------------------------------");

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a song title: ");
//        String title = scanner.nextLine();
//
//        songArtists = datasource.querySongInfoView(title);
//        if (songArtists.isEmpty()) {
//            System.out.println("Couldn't find the artist for the song");
//            return;
//        }
//
//        for (SongArtist artist : songArtists) {
//            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName() +
//                    " Album name = " + artist.getAlbumName() +
//                    "Track number = " + artist.getTrack());
//        }


        System.out.println("------------------------------------------");

//        datasource.insertSong("Touch of Grey", "Grateful Dead", "In The Dark", 1);
//        datasource.insertSong("Like A Rolling Stone", "Bod Dylan",
//                "Bob Dylan's Greatest Hits", 5);
        datasource.insertSong("Bird Dog", "Everly Brothers",
                "All-Time Greatest Hits", 7);

        datasource.close();

    }
}










