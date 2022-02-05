package br.com.leivas.exercise1;

public final class ContactFactory {

    public Contact produce(String name, String phone) {
        ContactUtil.isValidName(name);
        ContactUtil.isValidPhoneNumber(phone);
        return new Contact(name, phone);
    }
}
