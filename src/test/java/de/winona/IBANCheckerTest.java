package de.winona;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IBANCheckerTest {

    @Test
    void testValidIban() {
        String validIban = "DE22790200760027913168";
        assertTrue(IBANChecker.validate(validIban), "Gültige IBAN sollte true zurückgeben");
    }

    @Test
    void testInvalidIban() {
        String invalidIban = "DE21790200760027913173";
        assertFalse(IBANChecker.validate(invalidIban), "Ungültige IBAN sollte false zurückgeben");
    }

    @Test
    void testWrongLength() {
        String wrongLengthIban = "DE227902007600279131"; // zu kurz
        assertFalse(IBANChecker.validate(wrongLengthIban), "IBAN mit falscher Länge sollte false zurückgeben");
    }

    @Test
    void testUnknownCountryCode() {
        String unknownCountryIban = "XX22790200760027913168"; // unbekannter Ländercode
        assertFalse(IBANChecker.validate(unknownCountryIban), "Unbekannter Ländercode sollte false zurückgeben");
    }
}
