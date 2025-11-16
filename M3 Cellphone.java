class Phone {

    // Method 1: Ringing
    void ring() {
        System.out.println("The phone is ringing...");
    }

    // Method 2: Vibrating
    void vibrate() {
        System.out.println("The phone is vibrating...");
    }

    // Method 3: Call friend
    void callFriend() {
        System.out.println("Calling your friend...");
    }
}

public class Cellphone {
    public static void main(String[] args) {

        // Creating object of Cellphone
        Phone myPhone = new Phone();

        // Calling the methods
        myPhone.ring();
        myPhone.vibrate();
        myPhone.callFriend();
    }
}
