package br.com.leivas.exercise13;

import br.com.leivas.common.BaseException;

public class PositionNotFoundException extends BaseException {
    public PositionNotFoundException(String message) {
        super(message);
    }
}
