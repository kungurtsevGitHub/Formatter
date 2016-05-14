package main.java.it.sevenbits.formatter.stateMachine.tableTransitions;

import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;
import main.java.it.sevenbits.formatter.stateMachine.concreteStates.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by igor on 14.05.16.
 */
public class TableTransit implements InterfaceTableTransit {
    Map<String, InterfaceState> table;

    public TableTransit() {
        table = new HashMap<String, InterfaceState>();
        this.hash();
    }

    public void hash() {
        table.put("(", WaitingBktOpen.Instance());
        table.put(")", WaitingBktClose.Instance());
        table.put(";", WaitingSemicolon.Instance());
        table.put("{", WaitingBraceOpen.Instance());
        table.put("}", WaitingBraceClose.Instance());
        table.put("+", WaitingArithmeticalOperator.Instance());
        table.put("-", WaitingArithmeticalOperator.Instance());
        table.put("*", WaitingArithmeticalOperator.Instance());
        table.put("/", WaitingArithmeticalOperator.Instance());
        table.put("%", WaitingArithmeticalOperator.Instance());
    }

    public boolean containsKey(String key) {
        return table.containsKey(key);
    }

    public InterfaceState get(String key) {
        return table.get(key);
    }
}
