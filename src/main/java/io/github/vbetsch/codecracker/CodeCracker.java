package io.github.vbetsch.codecracker;

import java.util.Map;

public class CodeCracker {
    private static final Map<Character, Character> translations = Map.of(
            'a', '!',
            'b', ')'
    );

    public static char decryptLetter(char letter) {
        return translations.get(letter);
    }

    public static String decryptWord(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            stringBuilder.append(decryptLetter(c));
        }
        return stringBuilder.toString();
    }
}