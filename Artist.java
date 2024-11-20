public class Artist {
    private String artistName;
    private String artistEmail;
    private String artistPassword;

    public Artist(String artistName, String artistEmail, String artistPassword) {
        this.artistName = artistName;
        this.artistEmail = artistEmail;
        this.artistPassword = artistPassword;
    }

    public void editArtist(String newName, String newEmail, String newPassword) {
        this.artistName = newName;
        this.artistEmail = newEmail;
        this.artistPassword = newPassword;
        System.out.println("Artist information updated.");
    }

    public void loginArtist(String email, String password) {
        if (artistEmail.equals(email) && artistPassword.equals(password)) {
            System.out.println("Artist logged in: " + artistName);
        } else {
            System.out.println("Login failed for artist.");
        }
    }

    public void logoutArtist() {
        System.out.println("Artist " + artistName + " logged out.");
    }

    // Getter and Setter
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getArtistEmail() {
        return artistEmail;
    }

    public void setArtistEmail(String artistEmail) {
        this.artistEmail = artistEmail;
    }

    public String getArtistPassword() {
        return artistPassword;
    }

    public void setArtistPassword(String artistPassword) {
        this.artistPassword = artistPassword;
    }
}
