package br.com.leivas.exercise12;

import br.com.leivas.common.StringUtils;
import br.com.leivas.common.ValueNotValidException;


public record PalindromeVerifier(String stringUnderTest) implements IPalindromeVerifier {

    @Override
    public boolean isStringPalindrome() {
        final StringUtils stringUtils = new StringUtils();
        if (this.stringUnderTest.length() > 50 || stringUtils.stringHasNotOnlyLowerCase(this.stringUnderTest)) {
            throw new ValueNotValidException("Value must be at lower case and its length should be at most 50");
        }
        final String invertedString = this.invertString();
        return this.stringUnderTest.equalsIgnoreCase(invertedString);
    }

    private String invertString() {
        return new StringBuilder(this.stringUnderTest).reverse().toString();
    }
}
