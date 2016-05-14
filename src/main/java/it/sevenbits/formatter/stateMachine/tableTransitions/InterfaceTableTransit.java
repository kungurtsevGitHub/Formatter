package main.java.it.sevenbits.formatter.stateMachine.tableTransitions;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;

/**
 * Created by igor on 14.05.16.
 */
public interface InterfaceTableTransit {
    public void hash();
    public boolean containsKey(String key);
    public InterfaceState get(String key);
}
