package main.java.it.sevenbits.formatter.inputStream;

import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;

/**
 * Created by igor on 13.05.16.
 */
public interface IReader {
    public char readSymbol() throws ReaderException;
    public  boolean hasNext()throws ReaderException;
}
