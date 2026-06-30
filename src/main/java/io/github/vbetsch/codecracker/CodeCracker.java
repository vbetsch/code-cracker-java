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
}