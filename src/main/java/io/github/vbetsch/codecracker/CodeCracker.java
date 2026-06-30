package io.github.vbetsch.codecracker;

public class CodeCracker {
    private final TranslationDictionary dictionary = new TranslationDictionary();

    public char decryptLetter(char letter) {
        return dictionary.getDecryptions().get(letter);
    }

    public char encryptChar(char character) {
        return dictionary.getEncryptions().get(character);
    }

    public String decryptWord(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(decryptLetter(c));
        }
        return stringBuilder.toString();
    }

    public String encryptString(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(encryptChar(c));
        }
        return stringBuilder.toString();
    }
}