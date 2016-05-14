package main.java.it.sevenbits.formatter.stateMachine;


import main.java.it.sevenbits.formatter.inputStream.IReader;
import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;
import main.java.it.sevenbits.formatter.outputStream.IWriter;
import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;
import main.java.it.sevenbits.formatter.stateMachine.tableTransitions.InterfaceTableTransit;

/**
 * Created by igor on 13.05.16.
 */
public class State implements InterfaceState {
    protected void changeState(InterfaceStateMachine sMachine, InterfaceState state) {
        sMachine.changeState(state);
    }

    public void transition(InterfaceStateMachine sMachine, IReader reader, IWriter writer, InterfaceTableTransit tableTransitions) throws ReaderException, WriterException{

    }

}
