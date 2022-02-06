package br.com.leivas.exercise7;

import br.com.leivas.StringUtils;

import java.util.*;

public final class AlternatingStringMaker {

    private final String valueUnderTest;
    private final List<CharacterPair> pairs = new ArrayList<>();
    private final Set<String> candidates = new HashSet<>();
    private String bestResult;
    private int bestResultLength = 0;

    public AlternatingStringMaker(String value) {
        this.valueUnderTest = value;
    }

    public String makeAlternateString() {
        this.buildAndTestCharacterPairs();
        this.defineBestResult();
        return String.format("The best Result for String %s is: %s, with length: %s", this.valueUnderTest, this.bestResult, this.bestResultLength);
    }

    private void buildAndTestCharacterPairs() {
        List<Character> characters = new StringUtils().extractUniqueCharacteres(this.valueUnderTest);
        for (int current = 0; current < characters.size(); current++) {
            for (int next = current + 1; next < characters.size(); next++) {
                CharacterPair characterPair = new CharacterPair(characters.get(current), characters.get(next));
                this.pairs.add(characterPair);
            }
        }
        this.testCharacteresPairs();
    }

    private void testCharacteresPairs() {
        final StringUtils stringUtils = new StringUtils();
        for (CharacterPair pair : this.pairs) {
            String candidate = this.valueUnderTest;
            candidate = stringUtils.removeCharacters(candidate, Arrays.asList(pair.getCharactererOne(), pair.getCharactererTwo()));
            if (this.isAlternatingString(candidate)) {
                this.candidates.add(candidate);
            }
        }
    }

    private void defineBestResult() {
        if (this.candidates.isEmpty()) {
            throw new NoAlternateResultFoundException(String.format("No alternating characteres string could be made for String %s", this.valueUnderTest));
        }
        this.bestResult = this.candidates.stream().
                max(Comparator.comparingInt(String::length)).get();
        this.bestResultLength = this.bestResult.length();
    }

    private boolean isAlternatingString(String candidate) {
        for (int i = 0; i < candidate.length() - 2; i++) {
            if (candidate.charAt(i) != candidate.charAt(i + 2)) {
                return false;
            }
        }
        return candidate.charAt(0) != candidate.charAt(1);
    }
}
