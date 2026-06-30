package io.github.vbetsch.codecracker;

public class CodeCracker {
    private final TranslationDictionary dictionary = new TranslationDictionary();

    public char decryptChar(char letter) {
        return dictionary.getDecryptions().get(letter);
    }

    public char encryptLetter(char character) {
        return dictionary.getEncryptions().get(character);
    }

    public String decryptString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(decryptChar(c));
        }
        return stringBuilder.toString();
    }

    public String encryptString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(encryptLetter(c));
        }
        return stringBuilder.toString();
    }
}