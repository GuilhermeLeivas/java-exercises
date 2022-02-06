package br.com.leivas.exercise1;

import br.com.leivas.ScannerUtil;

public class Solution1 {

    public static void main(String[] args) {
        Operation operation = new Operation();
        int totalElements;
        totalElements = operation.readElementsTotal();
        operation.fillElements(totalElements);
        operation.findElements();
        ScannerUtil.getInstance().dispose();
    }
}
