/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/
import java.util.ArrayList;

public class Rolodex {

    // COMPOSITION + POLYMORPHISM
    private ArrayList<Displayable> contacts;

    public Rolodex() {
        contacts = new ArrayList<>();
    }

    public void addContact(Displayable contact) {
        contacts.add(contact);
    }

    public void displayContacts() {

        System.out.println("\n--- Contact List ---");

        // POLYMORPHISM happens here
        for (Displayable c : contacts) {
            System.out.println(c.display());
        }
    }
}
