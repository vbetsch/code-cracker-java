package io.github.vbetsch.codecracker;

public class CodeCracker {
    private final Cypher cypher = new Cypher();

    public char decryptLetter(char letter) {
        return cypher.decryptLetter(letter);
    }

    public char encryptChar(char character) {
        return cypher.encryptChar(character);
    }

    public String decryptWord(String string) {
        return cypher.decryptWord(string);
    }
}