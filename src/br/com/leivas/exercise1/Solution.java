package br.com.leivas.exercise1;

public class Solution {

    public static void main(String[] args) {

        Operation operation = new Operation();
        int totalElements;
        totalElements = operation.readElementsTotal();
        operation.fillElements(totalElements);
        operation.findElements();
    }
}
