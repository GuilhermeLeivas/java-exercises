package br.com.leivas.exercise10;

import br.com.leivas.common.ScannerUtil;

import java.util.List;
import java.util.Scanner;

public class Solution10 {
    private static final ScannerUtil scannerUtil = ScannerUtil.getInstance();

    public static void main(String[] args) {
        final Scanner scanner = scannerUtil.getScanner();
        int option = 1;
        System.out.println("Type the list initial size\n");
        final int initialSize = scanner.nextInt();
        List<Integer> fixedSizedList = new FixedSizedList<>(initialSize);
        final OperationUtil operationUtil = new OperationUtil(fixedSizedList);
        while (option != 2) {
            System.out.println("1- New Operation / 2-Leave program");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                operationUtil.OnListOperation();
            }
        }
        operationUtil.printValuesFromList();
        scannerUtil.dispose();
    }
}
