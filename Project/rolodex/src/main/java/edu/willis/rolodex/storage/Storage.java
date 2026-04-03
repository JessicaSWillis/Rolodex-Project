package edu.willis.rolodex.storage;


import edu.willis.rolodex.model.Contact;
import java.util.List;

public interface Storage {

    void save(Contact contact);
    List<Contact> findAll();
}
