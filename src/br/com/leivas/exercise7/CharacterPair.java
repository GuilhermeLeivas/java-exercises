package br.com.leivas.exercise7;

import java.util.Objects;

public class CharacterPair {

    private final Character charactererOne;
    private final Character charactererTwo;

    public CharacterPair(char charactererOne, char charactererTwo) {
        this.charactererOne = charactererOne;
        this.charactererTwo = charactererTwo;
    }

    public Character getCharactererOne() {
        return charactererOne;
    }

    public Character getCharactererTwo() {
        return charactererTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CharacterPair that = (CharacterPair) o;
        return charactererOne.equals(that.charactererOne) && charactererTwo.equals(that.charactererTwo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(charactererOne, charactererTwo);
    }
}
