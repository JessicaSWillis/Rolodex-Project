/*
Jessica Willis
3/7/2026
Project phase 1
Rolodex App
*/

public class FamilyContact extends Contact {
    private String relationship;

    public FamilyContact(String firstName, String lastName, String phone, String email, String relationship) {
        super(firstName, lastName, phone, email);
        this.relationship = relationship;
    }

    public String toString() {
        return super.toString() + " | Relationship: " + relationship;
    }

}
