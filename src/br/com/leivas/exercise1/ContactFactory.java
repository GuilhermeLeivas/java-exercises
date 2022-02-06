package br.com.leivas.exercise1;

public final class ContactFactory {

    public Contact produce(String name, String phone) {
        ContactValidator contactValidator = new ContactValidatorImpl();
        contactValidator.isValidName(name);
        contactValidator.isValidPhoneNumber(phone);
        return new Contact(name, phone);
    }
}
