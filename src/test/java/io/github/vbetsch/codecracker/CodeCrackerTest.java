package io.github.vbetsch.codecracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeCrackerTest {

    @Test
    void should_returnExclamationPoint_whenDecryptLetterA() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char decryptedLetterA = codeCracker.decryptLetter('a');

        // Assert
        assertEquals('!', decryptedLetterA);
    }

    @Test
    void should_returnEndParenthesis_whenDecryptLetterB() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char decryptedLetterA = codeCracker.decryptLetter('b');

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

    @Test
    void should_returnCorrectString_whenDecryptWordHello() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String decryptedString = codeCracker.decryptWord("hello");

        // Assert
        assertEquals("&£aad", decryptedString);
    }

    @Test
    void should_returnCorrectString_whenDecryptWordWorld() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String decryptedString = codeCracker.decryptWord("world");

        // Assert
        assertEquals("ldga(", decryptedString);
    }

    @Test
    void should_returnLetterA_whenEncryptCharExclamationPoint() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char encryptedExclamationPoint = codeCracker.encryptChar('!');

        // Assert
        assertEquals('a', encryptedExclamationPoint);
    }

    @Test
    void should_returnLetterB_whenEncryptCharEndParenthesis() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char encryptedEndParenthesis = codeCracker.encryptChar(')');

        // Assert
        assertEquals('b', encryptedEndParenthesis);
    }

    @Test
    void should_returnWordAB_whenEncryptExclamationPointAndEndParenthesis() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String encryptedExclamationPointAndEndParenthesis = codeCracker.encryptString("!)");

        // Assert
        assertEquals("ab", encryptedExclamationPointAndEndParenthesis);

    }
}
