import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Buat data pengguna
        User user = new User("fahran", "12345", "fahran@gmail.com");

        // Buat beberapa lagu
        new Song("Imagine", "John Lennon", "1971-10-11", "Imagine all the people...", "Imagine", "Soft Rock", 183);
        new Song("Bohemian Rhapsody", "Queen", "1975-10-31", "Is this the real life? Is this just fantasy?", "A Night at the Opera", "Rock", 354);
        new Song("Smells Like Teen Spirit", "Nirvana", "1991-09-10", "Here we are now, entertain us!", "Nevermind", "Grunge", 301);
        new Song("Hotel California", "Eagles", "1976-02-22", "Welcome to the Hotel California...", "Hotel California", "Classic Rock", 391);
        new Song("Billie Jean", "Michael Jackson", "1983-01-02", "Billie Jean is not my lover...", "Thriller", "Pop", 294);
        new Song("Hey Jude", "The Beatles", "1968-08-26", "Hey Jude, don't make it bad...", "Hey Jude", "Pop Rock", 431);
        new Song("Shape of You", "Ed Sheeran", "2017-01-06", "The club isn't the best place to find a lover...", "Divide", "Pop", 233);
        new Song("Rolling in the Deep", "Adele", "2010-11-29", "We could have had it all...", "21", "Soul", 228);
        new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars", "2014-11-10", "Don't believe me, just watch!", "Uptown Special", "Funk", 269);
        new Song("Blinding Lights", "The Weeknd", "2019-11-29", "I said, ooh, I'm blinded by the lights...", "After Hours", "Synth-Pop", 200);


        Playlist playlist = new Playlist("My Favorite Songs");

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to Barly Music App!");
        System.out.println();
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println();


        if (user.login(username, password)) {
            System.out.println("Login successful!");
            boolean running = true;
            boolean isPlaylistMode = false; // Awalnya mode song

            while (running) {
                System.out.println("Menu:");
                System.out.println("1. Play");
                System.out.println("2. Pause");
                System.out.println("3. Next");
                System.out.println("4. Previous");
                System.out.println("5. View Playlist");
                System.out.println("6. Add Current Song to Playlist");
                System.out.println("7. Logout");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        if (isPlaylistMode) {
                            playlist.play();
                        } else {
                            Song.getCurrentSong().play();
                        }
                        break;
                    case 2:
                        if (isPlaylistMode) {
                            playlist.pause();
                        } else {
                            Song.getCurrentSong().pause();
                        }
                        break;
                    case 3:
                        if (isPlaylistMode) {
                            playlist.next();
                        } else {
                            Song.next(); // Ganti lagu dalam mode individu
                        }
                        break;
                    case 4:
                        if (isPlaylistMode) {
                            playlist.prev();
                        } else {
                            Song.prev(); // Ganti lagu dalam mode individu
                        }
                        break;
                    case 5:
                        playlist.viewPlaylist();
                        isPlaylistMode = true; // Beralih ke mode playlist
                        break;
                    case 6:
                        playlist.addSong(Song.getCurrentSong());
                        System.out.println("Added \"" + Song.getCurrentSong().getSong() + "\" to playlist.");
                        break;
                    case 7:
                        user.logout();
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }
        } else {
            System.out.println("Login failed. Please try again.");
        }

        scanner.close();
    }
}
