package br.com.leivas.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public final class ContactRepository {

    private ContactRepository() {
    }

    private static ContactRepository repositoryInstance;
    private Map<String, String> people;


    public static ContactRepository instance() {
        if (repositoryInstance == null) {
            repositoryInstance = new ContactRepository();
        }
        return repositoryInstance;
    }

    public Contact savePerson(String name, String phone) {
        final Contact contact = new ContactFactory().produce(name, phone);
        this.addToMap(contact);
        return contact;
    }

    public List<Contact> findAll() {
        return this.people.entrySet().stream().map(entry -> new Contact(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }

    public Optional<Contact> findByName(String name) {
        return this.people.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(name))
                .map(entry -> new Contact(entry.getKey(), entry.getValue()))
                .findFirst();
    }

    private void addToMap(Contact person) {
        if (this.people == null) {
            this.people = new HashMap<>();
        }
        this.people.put(person.getName(), person.getPhone());
    }
}
