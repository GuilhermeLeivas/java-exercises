package br.com.leivas.exercise1;

import br.com.leivas.common.ValueNotValidException;

public class ParseUtil {
    public static int tryParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception ex) {
            throw new ValueNotValidException("The input should be a number\n");
        }
    }
}
