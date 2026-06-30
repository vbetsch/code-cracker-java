package io.github.vbetsch.codecracker;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class Cypher {
    private final Map<Character, Character> dictionary = Map.ofEntries(
            entry('a', '!'),
            entry('b', ')'),
            entry('c', '"'),
            entry('d', '('),
            entry('e', '£'),
            entry('f', '*'),
            entry('g', '%'),
            entry('h', '&'),
            entry('i', '>'),
            entry('j', '<'),
            entry('k', '@'),
            entry('l', 'a'),
            entry('m', 'b'),
            entry('n', 'c'),
            entry('o', 'd'),
            entry('p', 'e'),
            entry('q', 'f'),
            entry('r', 'g'),
            entry('s', 'h'),
            entry('t', 'i'),
            entry('u', 'j'),
            entry('v', 'k'),
            entry('w', 'l'),
            entry('x', 'm'),
            entry('y', 'n'),
            entry('z', 'o')
    );

    private static Map<Character, Character> invertMap(Map<Character, Character> map) {
        Map<Character, Character> inverted = new HashMap<>();
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            inverted.put(entry.getValue(), entry.getKey());
        }
        return inverted;
    }

    public char decryptLetter(char letter) {
        return dictionary.get(letter);
    }

    public char encryptChar(char character) {
        return invertMap(dictionary).get(character);
    }
}
