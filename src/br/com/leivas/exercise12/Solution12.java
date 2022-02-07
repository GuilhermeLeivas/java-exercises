package br.com.leivas.exercise12;

import br.com.leivas.ScannerUtil;
import br.com.leivas.ValueNotValidException;

import java.util.Scanner;

public class Solution12 {
    private static final ScannerUtil scannerUtil = ScannerUtil.getInstance();

    public static void main(String[] args) {
        final Scanner scanner = scannerUtil.getScanner();
        System.out.println("Type a string to be tested if it is a palindrome!");
        final String stringUnderTest = scanner.nextLine();
        try {
            IPalindromeVerifier palindromeVerifier = new PalindromeVerifier(stringUnderTest);
            final boolean isPalindrome = palindromeVerifier.isStringPalindrome();
            System.out.printf("Is Palindrome -> %s", isPalindrome ? "Yes" : "Não");
        } catch (ValueNotValidException ex) {
            System.out.println(ex.getMessage());
        }
        scannerUtil.dispose();
    }
}
