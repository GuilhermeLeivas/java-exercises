package br.com.leivas.exercise8;

public class Solution8 {

    public static void main(String[] args) {
        final MySingleton instance1 = MySingleton.getInstance();
        final MySingleton instance2 = MySingleton.getInstance();
        boolean areTheseSameInstance = (instance1 == instance2);
        System.out.println("Are these same instance ? " + (areTheseSameInstance ? "YES" : "NOOO"));
    }
}

