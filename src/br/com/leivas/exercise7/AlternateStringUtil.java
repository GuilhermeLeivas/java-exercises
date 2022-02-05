package br.com.leivas.exercise7;

public class AlternateStringUtil {

    private String value;

    public AlternateStringUtil(String value) {
        this.value = value;
    }

    public String alternateString() {
        this.removeSequences();
        this.removeNotAlternateValues();
        return this.value;
    }

    private void removeSequences() {
        for (int i = 0; i < this.value.length(); i++) {
            if (this.charHasSequence(i)) {
                this.value = this.value.replaceAll(String.valueOf(this.value.charAt(i)), "");
            }
        }
    }

    private void removeNotAlternateValues() {
        for (int i = 0; i < this.value.length(); i++) {
            if (this.isNotAlternate(i)) {
                this.value = this.value.replaceAll(String.valueOf(this.value.charAt(i)), "");
            }
        }
    }

    private boolean charHasSequence(int charIndex) {
        char current = this.value.charAt(charIndex);
        boolean previousIsEqualToCurrent = false;
        boolean nextIsEqualToCurrent = false;
        if (charIndex != 0) {
            char previous = this.value.charAt(charIndex - 1);
            previousIsEqualToCurrent = Character.compare(current, previous) == 0;
        }
        if (charIndex != (this.value.length() - 1)) {
            char next = this.value.charAt(charIndex + 1);
            nextIsEqualToCurrent = Character.compare(current, next) == 0;
        }
        return previousIsEqualToCurrent || nextIsEqualToCurrent;
    }

    private boolean isNotAlternate(int charIndex) {
        char current = this.value.charAt(charIndex);
        boolean hasNotPreviousAlternate = false;
        boolean hasNotNextAlternate = false;
        if (charIndex != 0) {
            char previous = this.value.charAt(charIndex - 2);
            hasNotPreviousAlternate = Character.compare(current, previous) != 0;
        }
        if (charIndex != (this.value.length() - 1)) {
            char next = this.value.charAt(charIndex + 2);
            hasNotNextAlternate = Character.compare(current, next) != 0;
        }
        return !hasNotPreviousAlternate && !hasNotNextAlternate;
    }
}
