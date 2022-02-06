package br.com.leivas.exercise1;

import br.com.leivas.ValueNotValidException;

import static br.com.leivas.StringUtils.stringHasNotOnlyLowerCase;
import static br.com.leivas.StringUtils.stringHasNumbers;

public class ContactValidator {

    public static void isValidName(String name) {
        if (stringHasNotOnlyLowerCase(name)) {
            throw new ValueNotValidException("Name must have only lower case digits.");
        }
        if (stringHasNumbers(name)) {
            throw new ValueNotValidException("Name must have only letters, please remove all numbers on it.");
        }
    }

    public static void isValidPhoneNumber(String phoneNumber) {
        if (phoneHasIncorrectSize(phoneNumber)) {
            throw new ValueNotValidException("Phone number has an invalid number of digits, it must have 8 digits.");
        }

        if (phoneHasLeadingZeros(phoneNumber)) {
            throw new ValueNotValidException("Phone number has leading zeros, please type a valid number.");
        }

    }

    private static boolean phoneHasIncorrectSize(String phoneNumber) {
        return phoneNumber.length() != 8;
    }

    private static boolean phoneHasLeadingZeros(String phoneNumber) {
        int result = phoneNumber.length() - String.valueOf(Integer.parseInt(phoneNumber)).length();
        return result != 0;
    }
}
