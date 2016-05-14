package main.java.it.sevenbits.formatter.stateMachine;

/**
 * Created by igor on 12.05.16.
 */
public interface InterfaceStateMachine {
    public void changeState(InterfaceState State);
    public char getCurrentSymbol();
    public void changeCurrentSymbol(char symbol);
}
