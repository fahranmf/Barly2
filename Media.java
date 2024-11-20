public abstract class Media {
    private String song;
    private String artist;
    private String releaseDate;
    private String lyrics;

    public Media(String song, String artist, String releaseDate, String lyrics) {
        this.song = song;
        this.artist = artist;
        this.releaseDate = releaseDate;
        this.lyrics = lyrics;
    }

    public abstract void play();
    public abstract void pause();
    public abstract void addToPlaylist();

    // Getter and Setter
    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
