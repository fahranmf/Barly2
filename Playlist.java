import java.util.ArrayList;

public class Playlist {
    private String titlePlaylist;
    private ArrayList<Song> songs;
    private int currentSongIndex;

    public Playlist(String titlePlaylist) {
        this.titlePlaylist = titlePlaylist;
        this.songs = new ArrayList<>();
        this.currentSongIndex = -1; // -1 berarti belum ada lagu yang diputar
    }

    public void play() {
        if (!songs.isEmpty()) {
            if (currentSongIndex == -1) {
                currentSongIndex = 0; // Mulai dari lagu pertama
            }
            System.out.println("Playing song: " + songs.get(currentSongIndex).getSong());
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void pause() {
        if (currentSongIndex != -1) {
            System.out.println("Pausing song: " + songs.get(currentSongIndex).getSong());
        } else {
            System.out.println("No song is currently playing.");
        }
    }

    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Added song: " + song.getSong() + " to playlist: " + titlePlaylist);
    }

    public void next() {
        if (!songs.isEmpty()) {
            currentSongIndex = (currentSongIndex + 1) % songs.size();
            play();
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void prev() {
        if (!songs.isEmpty()) {
            currentSongIndex = (currentSongIndex - 1 + songs.size()) % songs.size();
            play();
        } else {
            System.out.println("Playlist is empty.");
        }
    }

    public void viewPlaylist() {
        System.out.println("Playlist: " + titlePlaylist);
        for (int i = 0; i < songs.size(); i++) {
            System.out.println((i + 1) + ". " + songs.get(i).getSong());
        }
    }

    // Getter and Setter
    public String getTitlePlaylist() {
        return titlePlaylist;
    }

    public void setTitlePlaylist(String titlePlaylist) {
        this.titlePlaylist = titlePlaylist;
    }
}
