package main.java.it.sevenbits.formatter.outputStream;

import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;

/**
 * Created by igor on 13.05.16.
 */
public interface IWriter {
    public void writeSymbol(char symbol)throws WriterException;
}
