package br.com.leivas.exercise1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public final class ContactRepository implements Repository<Contact> {

    private ContactRepository() {
    }

    private static ContactRepository repositoryInstance;
    private Map<String, String> people;


    public static Repository<Contact> instance() {
        if (repositoryInstance == null) {
            repositoryInstance = new ContactRepository();
        }
        return repositoryInstance;
    }

    @Override
    public Contact save(Contact contact) {
        return this.addToMap(contact);
    }

    public List<Contact> findAll() {
        return this.people.entrySet().stream().map(entry -> new Contact(entry.getKey(), entry.getValue())).collect(Collectors.toList());
    }

    @Override
    public Optional<Contact> findById(int id) {
        return Optional.empty();
    }

    /**
     * Here i am not using the @param arg correctly because we are not using any database.
     * But it could be quite easily used in some sql like "Select * from Entity where arg = value"
     *
     * @param arg   Arg to be queried
     * @param value Value to arg
     * @return Optional of Contact queried
     */
    @Override
    public Optional<Contact> findByArg(String arg, String value) {
        if ("name".equals(arg)) {
            return this.people.entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().equalsIgnoreCase(value))
                    .map(entry -> new Contact(entry.getKey(), entry.getValue()))
                    .findFirst();
        }
        return Optional.empty();
    }

    private Contact addToMap(Contact contact) {
        if (this.people == null) {
            this.people = new HashMap<>();
        }
        this.people.put(contact.getName(), contact.getPhone());
        return contact;
    }
}
