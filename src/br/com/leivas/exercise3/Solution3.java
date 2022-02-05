package br.com.leivas.exercise3;

public class Solution3 {

    public static void main(String[] args) {
        Book book = new MyBook();
        book.setTitle("A Tale of two cities");
        System.out.printf("The title is %s", book.getTitle());
    }
}
