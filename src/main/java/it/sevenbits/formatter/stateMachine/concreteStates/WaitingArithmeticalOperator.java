package main.java.it.sevenbits.formatter.stateMachine.concreteStates;

import main.java.it.sevenbits.formatter.inputStream.IReader;
import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;
import main.java.it.sevenbits.formatter.outputStream.IWriter;
import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;
import main.java.it.sevenbits.formatter.stateMachine.InterfaceState;
import main.java.it.sevenbits.formatter.stateMachine.InterfaceStateMachine;
import main.java.it.sevenbits.formatter.stateMachine.State;
import main.java.it.sevenbits.formatter.stateMachine.tableTransitions.InterfaceTableTransit;

/**
 * Created by igor on 14.05.16.
 */
public class WaitingArithmeticalOperator extends State {
    public static InterfaceState Instance() {
        return new WaitingArithmeticalOperator();
    }


    public void transition(InterfaceStateMachine stateMachine, IReader reader, IWriter writer, InterfaceTableTransit tableTransitions) throws ReaderException, WriterException {
        try {
            writer.writeSymbol(' ');
            writer.writeSymbol(stateMachine.getCurrentSymbol());
            writer.writeSymbol(' ');
            if(reader.hasNext()) {
                char symbol = reader.readSymbol();
                stateMachine.changeCurrentSymbol(symbol);
                String key =Character.toString(symbol);
                if(tableTransitions.containsKey((key)))
                    stateMachine.changeState(tableTransitions.get(key));
                /*
                if(symbol == '(' )
                    stateMachine.changeState(WaitingBktOpen.Instance());
                if (symbol == ')')
                    stateMachine.changeState(WaitingBktClose.Instance());
                 */
                else
                    stateMachine.changeState(WaitingSimpleSymbol.Instance());
            }
            else System.out.println("Formatting is over");
        }
        catch (ReaderException ex) {
            throw ex;
        }
        catch (WriterException ex) {
            throw ex;
        }
    }
}
