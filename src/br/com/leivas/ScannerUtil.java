package br.com.leivas;

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

    public void dispose() {
        this.scanner.close();
    }

    public Scanner getScanner() {
        if (this.scanner == null) {
            this.scanner = new Scanner(System.in);
        }
        return scanner;
    }
}
