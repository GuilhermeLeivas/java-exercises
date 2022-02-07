package br.com.leivas.common;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class StringUtils {

    public boolean stringHasNotOnlyLowerCase(String name) {
        return !name.equals(name.toLowerCase(Locale.ROOT));
    }

    public boolean stringHasNumbers(String name) {
        Pattern p = Pattern.compile("([0-9])");
        return p.matcher(name).find();
    }

    public List<Character> extractUniqueCharacteres(String value) {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < value.length(); i++) {
            characterSet.add(value.charAt(i));
        }
        return new ArrayList<>(characterSet);
    }

    /**
     * Remove all characters passed inside @param characters
     *
     * @param value      String to be updated
     * @param characters ALl characters that must be removed from @param value
     * @return Update String
     */
    public String removeCharacters(String value, List<Character> characters) {
        if (!characters.isEmpty()) {
            String regex = String.format("[%s]", characters.stream().map(Object::toString).collect(Collectors.joining("|")));
            value = value.replaceAll(regex, "");
        }
        return value;
    }
}
