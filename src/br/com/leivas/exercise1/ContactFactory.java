package br.com.leivas.exercise1;

public final class ContactFactory {

    public Contact produce(String name, String phone) {
        ContactValidator.isValidName(name);
        ContactValidator.isValidPhoneNumber(phone);
        return new Contact(name, phone);
    }
}
