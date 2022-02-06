package br.com.leivas.exercise10;

public class InvalidIndexException extends RuntimeException {

    private String message;

    public InvalidIndexException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
