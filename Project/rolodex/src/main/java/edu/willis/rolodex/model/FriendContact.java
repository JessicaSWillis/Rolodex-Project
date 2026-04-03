package edu.willis.rolodex.model;

import javax.persistence.Entity;

/**
 * Name: Jessica Willis
 * Date: April 3, 2026
 * Purpose: Friend Contact (POLYMORPHISM)
 */

@Entity
public class FriendContact extends Contact {

    public FriendContact() {}

    public FriendContact(String f, String l, String p) {
        super(f, l, p);
    }

    @Override
    public String getType() {
        return "Friend";
    }
}