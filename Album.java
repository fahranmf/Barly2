public class Album extends Media {
    private String titleAlbum;
    private String genre;
    private int duration;
    private int yearRelease;
    private String coverAlbum;

    public Album(String song, String artist, String releaseDate, String lyrics, 
                 String titleAlbum, String genre, int duration, int yearRelease, String coverAlbum) {
        super(song, artist, releaseDate, lyrics);
        this.titleAlbum = titleAlbum;
        this.genre = genre;
        this.duration = duration;
        this.yearRelease = yearRelease;
        this.coverAlbum = coverAlbum;
    }

    @Override
    public void play() {
        System.out.println("Playing album: " + titleAlbum);
    }

    @Override
    public void pause() {
        System.out.println("Stopping album: " + titleAlbum);
    }

    @Override
    public void addToPlaylist() {
        System.out.println("Adding album to playlist: " + titleAlbum);
    }

    public void next() {
        System.out.println("Skipping to the next song in the album.");
    }

    public void prev() {
        System.out.println("Going back to the previous song in the album.");
    }

    // Getter and Setter
    public String getTitleAlbum() {
        return titleAlbum;
    }

    public void setTitleAlbum(String titleAlbum) {
        this.titleAlbum = titleAlbum;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getCoverAlbum() {
        return coverAlbum;
    }

    public void setCoverAlbum(String coverAlbum) {
        this.coverAlbum = coverAlbum;
    }
}
