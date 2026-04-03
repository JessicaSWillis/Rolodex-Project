package edu.willis.rolodex.repository;


import edu.willis.rolodex.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Name: Jessica Willis
 * Date: April 3, 2026
 * Purpose: Handles database operations (CRUD)
 */

public interface ContactRepository extends JpaRepository<Contact, Long> {
}