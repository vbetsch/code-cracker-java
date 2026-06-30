package io.github.vbetsch.codecracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeCrackerTest {

    @Test
    void should_returnExclamationPoint_whenDecryptLetterA() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char decryptedLetterA = codeCracker.decryptLetter('!');

        // Assert
        assertEquals('a', decryptedLetterA);
    }

    @Test
    void should_returnEndParenthesis_whenDecryptLetterB() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char decryptedLetterA = codeCracker.decryptLetter(')');

        // Assert
        assertEquals('b', decryptedLetterA);
    }

    @Test
    void should_returnExclamationPointAndEndParenthesis_whenDecryptWordAB() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String decryptedString = codeCracker.decryptWord("!)");

        // Assert
        assertEquals("ab", decryptedString);
    }

    @Test
    void should_returnCorrectString_whenDecryptWordHello() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String decryptedString = codeCracker.decryptWord("&£aad");

        // Assert
        assertEquals("hello", decryptedString);
    }

    @Test
    void should_returnCorrectString_whenDecryptWordWorld() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String decryptedString = codeCracker.decryptWord("ldga(");

        // Assert
        assertEquals("world", decryptedString);
    }

    @Test
    void should_returnLetterA_whenEncryptCharExclamationPoint() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char encryptedExclamationPoint = codeCracker.encryptChar('a');

        // Assert
        assertEquals('!', encryptedExclamationPoint);
    }

    @Test
    void should_returnLetterB_whenEncryptCharEndParenthesis() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        char encryptedEndParenthesis = codeCracker.encryptChar('b');

        // Assert
        assertEquals(')', encryptedEndParenthesis);
    }

    @Test
    void should_returnWordAB_whenEncryptExclamationPointAndEndParenthesis() {
        // Arrange
        CodeCracker codeCracker = new CodeCracker();

        // Act
        String encryptedExclamationPointAndEndParenthesis = codeCracker.encryptString("ab");

        // Assert
        assertEquals("!)", encryptedExclamationPointAndEndParenthesis);

    }
}
