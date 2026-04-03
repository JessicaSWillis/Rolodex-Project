/**
 * Name: Jessica WIllis
 * Date: 4/2/2026
 * Purpose: Week 2 Rolodex Application
 */

public class App {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("Rolodex Contact Manager");
        System.out.println("Project Week 2");
        System.out.println("Jessica WIllis");
        System.out.println("=================================");

        Rolodex rolodex = new Rolodex();

        // Creating objects
        BusinessContact b1 = new BusinessContact(
                "John", "Smith", "555-1111", "john@email.com",
                "Google", "Manager");

        FriendContact f1 = new FriendContact(
                "Emily", "Davis", "555-3333", "emily@email.com",
                "Em");

        Contact c1 = new Contact(
                "Mark", "Brown", "555-4444", "mark@email.com");

        // POLYMORPHISM: all treated as Displayable
        rolodex.addContact(b1);
        rolodex.addContact(f1);
        rolodex.addContact(c1);

        // Displaying all contacts
        rolodex.displayContacts();
    }
}
