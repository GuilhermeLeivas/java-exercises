package br.com.leivas.exercise8;

public class MySingleton {

    private static MySingleton instance;
    private String str;

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
