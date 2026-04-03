package edu.willis.rolodex.model;

import javax.persistence.Entity;

/**
 * Name: Jessica Willis
 * Date: April 3, 2026
 * Purpose: Business Contact (POLYMORPHISM)
 */

@Entity
public class BusinessContact extends Contact {

    public BusinessContact() {}

    public BusinessContact(String f, String l, String p) {
        super(f, l, p);
    }

    @Override
    public String getType() {
        return "Business";
    }
}