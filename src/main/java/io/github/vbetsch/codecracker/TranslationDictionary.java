package io.github.vbetsch.codecracker;

import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

public class TranslationDictionary {

    private final Map<Character, Character> decryptions = Map.ofEntries(
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

    private final Map<Character, Character> encryptions = invert(decryptions);

    public Map<Character, Character> getDecryptions() {
        return decryptions;
    }

    public Map<Character, Character> getEncryptions() {
        return encryptions;
    }

    private static Map<Character, Character> invert(Map<Character, Character> map) {
        Map<Character, Character> inverted = new HashMap<>();
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            inverted.put(entry.getValue(), entry.getKey());
        }
        return inverted;
    }
}