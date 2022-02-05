package br.com.leivas.exercise1;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ContactSearchUtil {

    public static Object search(int searchType) {
        Object response;
        switch (searchType) {
            case 1 -> {
                final Scanner scanner = ScannerUtil.getInstance().getScanner();
                System.out.println("Type a name to be queried\n");
                final String name = scanner.nextLine();
                final Optional<Contact> contact = ContactRepository.instance().findByName(name);
                response = contact.isPresent() ? contact.get() : "Contact not Found";
            }
            case 2 -> {
                final List<Contact> allContacts = ContactRepository.instance().findAll();
                response = allContacts.isEmpty() ? "No contacts were found\n" : allContacts;
            }
            default -> response = "Operation not implemented\n";
        }
        return response;
    }
}
