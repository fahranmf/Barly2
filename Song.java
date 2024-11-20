import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private String releaseDate;
    private String lyrics;
    private String album;
    private String genre;
    private int duration; // in seconds

    private static ArrayList<Song> songList = new ArrayList<>(); // Daftar semua lagu
    private static int currentIndex = 0; // Indeks lagu saat ini

    public Song(String title, String artist, String releaseDate, String lyrics, String album, String genre, int duration) {
        this.title = title;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.lyrics = lyrics;
        this.album = album;
        this.genre = genre;
        this.duration = duration;

        // Tambahkan lagu ke daftar global
        songList.add(this);
    }

    public void play() {
        System.out.println("Now playing: " + title + " by " + artist);
    }

    public void pause() {
        System.out.println("Paused: " + title);
    }

    public static void next() {
        if (songList.size() > 1) {
            currentIndex = (currentIndex + 1) % songList.size(); // Berputar ke lagu berikutnya
            System.out.println("Now playing: " + songList.get(currentIndex).title + " by " + songList.get(currentIndex).artist);
        } else {
            System.out.println("No next song available.");
        }
    }

    public static void prev() {
        if (songList.size() > 1) {
            currentIndex = (currentIndex - 1 + songList.size()) % songList.size(); // Berputar ke lagu sebelumnya
            System.out.println("Now playing: " + songList.get(currentIndex).title + " by " + songList.get(currentIndex).artist);
        } else {
            System.out.println("No previous song available.");
        }
    }

    public static Song getCurrentSong() {
        return songList.get(currentIndex); // Dapatkan lagu saat ini
    }

    public String getSong() {
        return title;
    }
}
