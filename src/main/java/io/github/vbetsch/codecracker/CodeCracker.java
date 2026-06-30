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
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(decryptLetter(c));
        }
        return stringBuilder.toString();
    }
}