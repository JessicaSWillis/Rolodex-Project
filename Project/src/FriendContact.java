/**
 * Name: Jessica WIllis
 * Date: 2026
 * Demonstrates inheritance and polymorphism
 */

public class FriendContact extends Contact {

    private String nickname;

    public FriendContact(String firstName, String lastName, String phone, String email,
                         String nickname) {

        super(firstName, lastName, phone, email);
        this.nickname = nickname;
    }

    // POLYMORPHISM
    @Override
    public String display() {
        return super.display() + " | Nickname: " + nickname;
    }
}