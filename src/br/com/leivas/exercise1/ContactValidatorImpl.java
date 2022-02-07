package br.com.leivas.exercise1;

import br.com.leivas.common.StringUtils;
import br.com.leivas.common.ValueNotValidException;


public class ContactValidatorImpl implements ContactValidator {
    private final StringUtils stringUtils;

    public ContactValidatorImpl() {
        this.stringUtils = new StringUtils();
    }

    @Override
    public void isValidName(String name) {
        if (stringUtils.stringHasNotOnlyLowerCase(name)) {
            throw new ValueNotValidException("Name must have only lower case digits.");
        }
        if (stringUtils.stringHasNumbers(name)) {
            throw new ValueNotValidException("Name must have only letters, please remove all numbers on it.");
        }
    }

    @Override
    public void isValidPhoneNumber(String phoneNumber) {
        if (phoneHasIncorrectSize(phoneNumber)) {
            throw new ValueNotValidException("Phone number has an invalid number of digits, it must have 8 digits.");
        }

        if (phoneHasLeadingZeros(phoneNumber)) {
            throw new ValueNotValidException("Phone number has leading zeros, please type a valid number.");
        }

    }

    private boolean phoneHasIncorrectSize(String phoneNumber) {
        return phoneNumber.length() != 8;
    }

    private boolean phoneHasLeadingZeros(String phoneNumber) {
        int result = phoneNumber.length() - String.valueOf(Integer.parseInt(phoneNumber)).length();
        return result != 0;
    }
}
