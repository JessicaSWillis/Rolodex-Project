package edu.willis.rolodex.model;

import javax.persistence.*;

/**
 * Name: Jessica Willis
 * Date: April 3, 2026
 * Purpose: Abstract Contact class (ABSTRACTION, CONSTRUCTORS, ACCESS SPECIFIERS)
 */

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String phone;

    // Constructors
    public Contact() {}

    public Contact(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    // Abstract method (ABSTRACTION)
    public abstract String getType();

    // Getters/Setters (ACCESS SPECIFIERS)
    public Long getId() { return id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
}