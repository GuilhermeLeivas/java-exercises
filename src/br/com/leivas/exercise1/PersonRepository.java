package br.com.leivas.exercise1;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public final class PersonRepository {

    private PersonRepository() {
    }

    private static PersonRepository repositoryInstance;
    private Map<String, String> people;


    public static PersonRepository instance() {
        if (repositoryInstance == null) {
            repositoryInstance = new PersonRepository();
        }
        return repositoryInstance;
    }

    public Person savePerson(String name, String phone) {
        final Person person = new PersonFactory().produce(name, phone);
        this.addToMap(person);
        return person;
    }

    public Map<String, String> findAll() {
        return this.people;
    }

    public Optional<Person> findByName(String name) {
        return this.people.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(name))
                .map(entry -> new Person(entry.getKey(), entry.getValue()))
                .findFirst();
    }

    private void addToMap(Person person) {
        if (this.people == null) {
            this.people = new HashMap<>();
        }
        this.people.put(person.getName(), person.getPhone());
    }
}
