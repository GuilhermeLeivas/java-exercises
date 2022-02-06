package br.com.leivas.exercise7;

public class CharacterPair {

    private final String charactererOne;
    private final String charactererTwo;

    public CharacterPair(char charactererOne, char charactererTwo) {
        this.charactererOne = String.valueOf(charactererOne);
        this.charactererTwo = String.valueOf(charactererTwo);
    }

    public String getCharactererOne() {
        return charactererOne;
    }

    public String getCharactererTwo() {
        return charactererTwo;
    }
}
