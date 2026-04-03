/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/

public class Contact implements Displayable {

    protected String firstName;
    protected String lastName;
    protected String phone;
    protected String email;

    public Contact(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    // IMPLEMENTING INTERFACE METHOD
    @Override
    public String display() {
        return firstName + " " + lastName +
               " | Phone: " + phone +
               " | Email: " + email;
    }
}