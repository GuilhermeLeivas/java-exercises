package br.com.leivas.exercise7;

public class Solution7 {

    public static void main(String[] args) {

        try {
            final String result = new AlternatingStringMaker("abaacdabd").makeAlternateString();
            final String result2 = new AlternatingStringMaker("beabeefeab").makeAlternateString();
            System.out.println(result);
            System.out.println(result2);
        } catch (NoAlternateResultFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
