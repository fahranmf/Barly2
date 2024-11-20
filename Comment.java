public class Comment {
    private String username;
    private String time;
    private String text;

    public Comment(String username, String time, String text) {
        this.username = username;
        this.time = time;
        this.text = text;
    }

    public void viewComment() {
        System.out.println("[" + time + "] " + username + ": " + text);
    }

    public void addComment(String newComment) {
        this.text = newComment;
        System.out.println("Comment added by " + username);
    }

    public void deleteComment() {
        this.text = null;
        System.out.println("Comment deleted by " + username);
    }

    // Getter and Setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
