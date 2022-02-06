package br.com.leivas.exercise12;

import br.com.leivas.ValueNotValidException;

import java.util.Scanner;

public class Solution12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a string to be tested if it is a palindrome!");
        final String stringUnderTest = scanner.nextLine();
        try {
            final boolean isPalindrome = new PalindromeVerifier(stringUnderTest).isStringPalindrome();
            System.out.printf("Is Palindrome -> %s", isPalindrome ? "Yes" : "Não");
        } catch (ValueNotValidException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
