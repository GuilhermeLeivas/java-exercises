package br.com.leivas.exercise1;

import java.util.Locale;
import java.util.regex.Pattern;

public class ContactUtil {

    public static void isValidName(String name) {
        if (nameHasNotOnlyLowerCaseLetters(name)) {
            throw new InvalidValueException("Name must have only lower case digits.");
        }
        if (nameHasNumbers(name)) {
            throw new InvalidValueException("Name must have only letters, please remove all numbers on it.");
        }
    }

    public static void isValidPhoneNumber(String phoneNumber) {
        if (phoneHasIncorrectSize(phoneNumber)) {
            throw new InvalidValueException("Phone number has an invalid number of digits, it must have 8 digits.");
        }

        if (phoneHasLeadingZeros(phoneNumber)) {
            throw new InvalidValueException("Phone number has leading zeros, please type a valid number.");
        }

    }

    private static boolean nameHasNotOnlyLowerCaseLetters(String name) {
        return !name.equals(name.toLowerCase(Locale.ROOT));
    }

    private static boolean nameHasNumbers(String name) {
        Pattern p = Pattern.compile("([0-9])");
        return p.matcher(name).find();
    }

    private static boolean phoneHasIncorrectSize(String phoneNumber) {
        return phoneNumber.length() != 8;
    }

    private static boolean phoneHasLeadingZeros(String phoneNumber) {
        int result = phoneNumber.length() - String.valueOf(Integer.parseInt(phoneNumber)).length();
        return result != 0;
    }
}
