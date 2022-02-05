package br.com.leivas.exercise9;

public class Pizza implements Food {
    @Override
    public String getType() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void makeFood() {
        System.out.printf("Making a delicious %s\n", this.getType());
    }
}
