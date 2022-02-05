package br.com.leivas.exercise1;

public class InvalidValueException extends RuntimeException {

    private final String message;

    public InvalidValueException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
