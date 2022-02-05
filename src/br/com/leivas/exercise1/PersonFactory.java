package br.com.leivas.exercise1;

public final class PersonFactory {

    public Person produce(String name, String phone) {
        PersonUtil.isValidName(name);
        PersonUtil.isValidPhoneNumber(phone);
        return new Person(name, phone);
    }
}
