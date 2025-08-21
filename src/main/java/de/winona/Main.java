package de.winona;

public class Main {
    public static void main(String[] args) {
        String iban = "DE22790200760027913168";
        System.out.println("Welcome to the IBAN Checker!");
        System.out.println("IBAN " + iban + " is " + IBANChecker.validate(iban));
    }
}
