package br.com.leivas.exercise1;

import java.util.Scanner;

public class ScannerUtil {

    private static ScannerUtil instance;
    private Scanner scanner;

    private ScannerUtil() {
        scanner = new Scanner(System.in);
    }

    public static ScannerUtil getInstance() {
        if (instance == null) {
            instance = new ScannerUtil();
        }
        return instance;
    }

    public Scanner getScanner() {
        return scanner;
    }
}
