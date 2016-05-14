package main.java.it.sevenbits.formatter.inputStream;

import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;
import java.io.*;

/**
 * Created by igor on 13.05.16.
 */
public class FlReader implements IReader{
    FileInputStream fileReader;

    public FlReader(FileInputStream fReader) {
        fileReader = fReader;

    }

    public char readSymbol() throws ReaderException {
        try {
            return (char)fileReader.read();
        }
        catch (Exception ex) {
            throw new ReaderException("Can't read next element");
        }
    }

    public boolean hasNext() throws ReaderException {
        try {
            return fileReader.available() != 0;
        }
        catch (IOException ex) {
            throw new ReaderException("Input exception");
        }
    }
}
