package io.github.vbetsch.codecracker;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Cypher {
    private final TranslationDictionary dictionary = new TranslationDictionary();

    public char decryptLetter(char letter) {
        return dictionary.getDecryptions().get(letter);
    }

    public char encryptChar(char character) {
        return dictionary.getEncryptions().get(character);
    }
}
