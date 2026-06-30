package io.github.vbetsch.codecracker;

import java.util.Map;

public class CodeCracker {
    Map<Character, Character> translations = Map.of(
            'a', '!',
            'b', ')'
    );

    public char decrypt(char letter) {
        return this.translations.get(letter);
    }

    public String decryptWord(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(decrypt(c));
        }
        return stringBuilder.toString();
    }
}