package br.com.leivas.exercise2;

public class MotorCycle extends BiCycle {

    @Override
    protected String defineMe() {
        return "a Cycle with an engine.";
    }

    public MotorCycle() {
        System.out.printf("Hello i am a motorcyle, i am %s%n", this.defineMe());
        System.out.printf("My Ancestor is a Cyle who is %s", super.defineMe());
    }
}
