package edu.willis.rolodex.controller;

import edu.willis.rolodex.model.*;
import edu.willis.rolodex.service.ContactService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Name: Jessica Willis
 * Date: April 3, 2026
 * Purpose: Controller (MVC flow)
 */

@Controller
public class ContactController {

    @Autowired
    private ContactService service;

    // HOME
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // LIST
    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("contacts", service.getAll());
        return "list";
    }

    // FORM
    @GetMapping("/form")
    public String form(Model model) {
        model.addAttribute("contact", new FriendContact());
        return "form";
    }

    // SAVE (CREATE + UPDATE)
    @PostMapping("/save")
    public String save(@ModelAttribute Contact contact) {
        service.save(contact);
        return "redirect:/list";
    }

    // EDIT
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("contact", service.getById(id));
        return "form";
    }

    // DELETE
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        service.delete(id);
        return "redirect:/list";
    }
}