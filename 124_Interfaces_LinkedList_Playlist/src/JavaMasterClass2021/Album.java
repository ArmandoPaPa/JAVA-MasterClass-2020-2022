package JavaMasterClass2021;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }


    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }


    private Song findSong(String songTitle) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(songTitle)) {
                return checkedSong;
            }
        }
        return null;
    }


    public boolean addToPlayList(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) { //  < ???
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, List<Song> playList) {
        Song checkedSong = findSong(songTitle);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + songTitle + " is not in the album");
        return false;
    }

}
