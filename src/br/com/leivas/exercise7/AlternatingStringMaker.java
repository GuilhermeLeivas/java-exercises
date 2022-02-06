package br.com.leivas.exercise7;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class AlternatingStringMaker {

    private final String valueUnderTest;
    private String bestResult;
    private int bestLengthResult = 0;
    private Character[] characters;
    private final Set<String> candidates = new HashSet<>();

    public AlternatingStringMaker(String value) {
        this.valueUnderTest = value;
    }

    public String makeAlternateString() {
        this.extractUniqueCharacteres();
        this.testCharacteresPairs();
        this.defineBestResult();
        return String.format("The best Result for String %s is: %s, with length: %s", this.valueUnderTest, this.bestResult, this.bestLengthResult);
    }

    public void extractUniqueCharacteres() {
        Set<Character> characterSet = new HashSet<>();
        for (int i = 0; i < this.valueUnderTest.length(); i++) {
            characterSet.add(this.valueUnderTest.charAt(i));
        }
        this.characters = characterSet.toArray(new Character[characterSet.size()]);
    }

    private void testCharacteresPairs() {
        for (int current = 0; current < this.characters.length; current++) {
            for (int next = current + 1; next < this.characters.length; next++) {
                String candidate = this.valueUnderTest;
                CharacterPair characterPair = new CharacterPair(characters[current], characters[next]);
                candidate = this.removePair(candidate, characterPair);
                if (this.isAlternatingString(candidate)) {
                    this.candidates.add(candidate);
                }
            }
        }
    }

    private String removePair(String candidate, CharacterPair pair) {
        candidate = candidate.replaceAll(pair.getCharactererOne(), "");
        candidate = candidate.replaceAll(pair.getCharactererTwo(), "");
        return candidate;
    }

    private void defineBestResult() {
        if (this.candidates.isEmpty()) {
            throw new NoAlternateResultFoundException(String.format("No alternating characteres string could be made for String %s", this.valueUnderTest));
        }
        this.bestResult = this.candidates.stream().
                max(Comparator.comparingInt(String::length)).get();
        this.bestLengthResult = this.bestResult.length();
    }

    private boolean isAlternatingString(String s) {
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) != s.charAt(i + 2)) {
                return false;
            }
        }
        if (s.charAt(0) == s.charAt(1)) {
            return false;
        }
        return true;
    }
}
