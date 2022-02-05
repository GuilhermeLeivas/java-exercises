package br.com.leivas.exercise1;

public class ParseUtil {
    public static int tryParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (Exception ex) {
            throw new InvalidValueException("The input should be a number\n");
        }
    }
}
