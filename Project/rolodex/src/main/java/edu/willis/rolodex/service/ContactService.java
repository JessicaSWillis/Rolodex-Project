package edu.willis.rolodex.service;


import edu.willis.rolodex.model.Contact;
import edu.willis.rolodex.repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Name: Jessica Willis
 * Date: April 3, 2026
 * Purpose: Business logic layer (MVC - SERVICE)
 */

@Service
public class ContactService {

    @Autowired
    private ContactRepository repo;

    // CREATE
    public void save(Contact c) {
        repo.save(c);
    }

    // READ
    public List<Contact> getAll() {
        return repo.findAll();
    }

    // READ ONE
    public Contact getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    public void delete(Long id) {
        repo.deleteById(id);
    }
}