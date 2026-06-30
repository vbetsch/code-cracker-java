package io.github.vbetsch.codecracker;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeCrackerTest {

    @Test
    void should_returnExclamationPoint_whenDecryptLetterA() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char decryptedLetterA = codeCracker.decrypt('a');

        // Assert
        assertEquals('!', decryptedLetterA);
    }

    @Test
    void should_returnEndParenthesis_whenDecryptLetterB() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char decryptedLetterA = codeCracker.decrypt('b');

        // Assert
        assertEquals(')', decryptedLetterA);
    }

    @Test
    void should_returnExclamationPointAndEndParenthesis_whenDecryptWordAB() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String decryptedString = codeCracker.decryptWord("ab");

        // Assert
        assertEquals("!)", decryptedString);
    }
}
