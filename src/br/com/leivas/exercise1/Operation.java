package br.com.leivas.exercise1;

import br.com.leivas.ValueNotValidException;

import java.util.Scanner;

public class Operation {

    public int readElementsTotal() {
        int totalElements = 0;
        final Scanner scanner = ScannerUtil.getInstance().getScanner();
        while (this.isNotAValidNumberOfElements(totalElements)) {
            System.out.println("Please type a valid number of elements (the range is beteween 1 and 100000)\n");
            try {
                totalElements = ParseUtil.tryParse(scanner.nextLine());
            } catch (ValueNotValidException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return totalElements;
    }

    public void fillElements(int totalElements) {
        final Repository<Contact> contactRepository = ContactRepository.instance();
        final Scanner scanner = ScannerUtil.getInstance().getScanner();
        for (int i = 0; i < totalElements; i++) {
            try {
                System.out.println("Element: " + (i + 1));
                System.out.println("Type a name\n");
                String name = scanner.nextLine();
                System.out.println("Type a phone number\n");
                String phoneNumber = scanner.nextLine();
                Contact contact = new ContactFactory().produce(name, phoneNumber);
                contactRepository.save(contact);
                System.out.println("Contact add: " + contact);
            } catch (ValueNotValidException ex) {
                System.out.println(ex.getMessage());
                i--;
            }
        }
    }

    public void findElements() {
        final Scanner scanner = ScannerUtil.getInstance().getScanner();
        int operationChooser = 1;
        while (operationChooser != 3) {
            System.out.println("Type what you would like to do: 1- Search contact by name / 2- List contacts / 3- Leave program\n");
            try {
                operationChooser = ParseUtil.tryParse(scanner.nextLine());
                final Object response = ContactSearchUtil.search(operationChooser);
                System.out.println(response.toString());
            } catch (ValueNotValidException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private boolean isNotAValidNumberOfElements(int elements) {
        return (elements < 1 || elements > 100000);
    }
}
