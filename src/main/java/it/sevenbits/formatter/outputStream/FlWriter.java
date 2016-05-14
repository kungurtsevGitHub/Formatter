package main.java.it.sevenbits.formatter.outputStream;

import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;

import java.io.*;
/**
 * Created by igor on 13.05.16.
 */
public class FlWriter implements IWriter  {
    FileOutputStream fileWriter;

    public FlWriter(FileOutputStream fWriter) {
            fileWriter = fWriter;
    }

    public void writeSymbol(char symbol)throws WriterException {
        try {
            fileWriter.write((int)symbol);
        }
        catch(IOException ex) {
            throw new WriterException("Output exception");
        }
    }
}
