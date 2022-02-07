package br.com.leivas.exercise6;

import br.com.leivas.common.ScannerUtil;

public class Solution6 {
    public static void main(String[] args) {
        ArraySumUtil arraySumerUtil = new ArraySumUtil();
        arraySumerUtil.readElementsTotal();
        arraySumerUtil.readEachElement();
        arraySumerUtil.printAllElements();
        arraySumerUtil.printSumOfAllElements();
        ScannerUtil.getInstance().dispose();
    }
}
