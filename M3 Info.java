class User {
    String username;
    String email;
    int followers;

    // Constructor
    User(String username, String email, int followers) {
        this.username = username;
        this.email = email;
        this.followers = followers;
    }

    void postPhoto(String photoDescription) {
        System.out.println(username + " posted a photo: " + photoDescription);
    }

    void likePost(String post) {
        System.out.println(username + " liked the post: " + post);
    }

    void follow(User otherUser) {
        System.out.println(username + " followed " + otherUser.username);
        otherUser.followers++; // increase follower count
    }
}

public class Info {
    public static void main(String[] args) {

        // Creating user accounts
        User Ria = new User("Ria", "ria@gmail.com", 120);
        User Alex = new User("Alex", "alex@gmail.com", 200);

        // Using methods
        Ria.postPhoto("Beautiful Sunset!");
        Alex.likePost("Travel Vlog");
        Ria.follow(Alex);

        // Display follower count
        System.out.println(Alex.username + " now has " + Alex.followers + " followers.");
    }
}
