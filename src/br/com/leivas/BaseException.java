package br.com.leivas;

public class BaseException extends RuntimeException {

    private final String message;

    public BaseException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
