package main.java.it.sevenbits.formatter;

import main.java.it.sevenbits.formatter.inputStream.*;
import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;
import main.java.it.sevenbits.formatter.outputStream.*;
import main.java.it.sevenbits.formatter.outputStream.FlWriter;
import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;
import main.java.it.sevenbits.formatter.stateMachine.StateMachine;

import java.io.FileReader;
import java.io.*;
/**
 * Created by igor on 12.05.16.
 */
public class Format {

    /*public Format (String nameFileIn, String nameFileOut) {
        try {
            File fileIn = new File(nameFileIn);
            FileInputStream fileInputStream = new FileInputStream(nameFileIn);
            reader =new FlReader(fileInputStream);

            File fileOut = new File(nameFileOut);
            FileOutputStream fileOutputStream = new FileOutputStream(nameFileOut);
            writer =new FlWriter(fileOutputStream);
        }
        catch (FileNotFoundException ex) {
            throw new ReaderException("File not found exception");
        }
        catch (IOException ex) {
            throw new ReaderException("IOException");
        }
    }*/


    public void formate(IReader reader, IWriter writer) throws ReaderException, WriterException {
        try {
            StateMachine stateMachine = new StateMachine(reader, writer);
            while (reader.hasNext())
                stateMachine.transition();
            stateMachine.transition();
        } catch (ReaderException ex) {
            throw ex;
        } catch (WriterException ex) {
            throw ex;
        }
    }
}

