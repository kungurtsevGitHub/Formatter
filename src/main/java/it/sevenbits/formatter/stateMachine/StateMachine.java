package main.java.it.sevenbits.formatter.stateMachine;

import main.java.it.sevenbits.formatter.inputStream.IReader;
import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;
import main.java.it.sevenbits.formatter.outputStream.IWriter;
import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;
import main.java.it.sevenbits.formatter.stateMachine.concreteStates.StateStart;
import main.java.it.sevenbits.formatter.stateMachine.tableTransitions.InterfaceTableTransit;
import main.java.it.sevenbits.formatter.stateMachine.tableTransitions.TableTransit;

/**
 * Created by igor on 12.05.16.
 */
public class StateMachine implements InterfaceStateMachine {
    InterfaceState activeState;
    IReader reader;
    IWriter writer;
    char currentSymbol;
    InterfaceTableTransit tableTransitions;

    public StateMachine(IReader reader, IWriter writer) {
        activeState = StateStart.Instance();
        this.reader = reader;
        this.writer = writer;
        tableTransitions = new TableTransit();

    }

    public void transition() throws ReaderException, WriterException{
        activeState.transition(this, this.reader, this.writer, this.tableTransitions);
    }

    public void changeState(InterfaceState State) {
        this.activeState = State;
    }

    public char getCurrentSymbol() {
        return currentSymbol;
    }

    public void changeCurrentSymbol (char symbol) {
        this.currentSymbol = symbol;
    }

}
