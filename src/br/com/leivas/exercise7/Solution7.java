package br.com.leivas.exercise7;

public class Solution7 {

    public static void main(String[] args) {

        try {
            IAlternateStringMaker alternateStringMaker = new AlternatingStringMaker("abaacdabd");
            IAlternateStringMaker alternateStringMaker2 = new AlternatingStringMaker("beabeefeab");
            final String result = alternateStringMaker.makeAlternateString();
            final String result2 = alternateStringMaker2.makeAlternateString();
            System.out.println(result);
            System.out.println(result2);
        } catch (NoAlternateResultFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
