package br.com.leivas;

import java.util.Locale;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean stringHasNotOnlyLowerCase(String name) {
        return !name.equals(name.toLowerCase(Locale.ROOT));
    }

    public static boolean stringHasNumbers(String name) {
        Pattern p = Pattern.compile("([0-9])");
        return p.matcher(name).find();
    }
}
