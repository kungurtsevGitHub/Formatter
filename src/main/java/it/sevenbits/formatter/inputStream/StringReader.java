package main.java.it.sevenbits.formatter.inputStream;

import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;


/**
 * Created by igor on 13.05.16.
 */
public class StringReader implements  IReader{
    BufferedReader bufferReader;

    StringReader(BufferedReader inputStream) {
        bufferReader = inputStream;
    }

    public char readSymbol() throws ReaderException {
        int symbol;
        try {
            return(char)(symbol = bufferReader.read());
        }
        catch (IOException ex) {
            throw new ReaderException("Input exception");
        }
    }

    public boolean hasNext() {
        Scanner scanner = new Scanner(bufferReader);
        return scanner.hasNext();

    }

    public StringBuffer readString() throws ReaderException {
        StringBuffer strBuffer = new StringBuffer();
        while (this.hasNext()) {
            try {
                char symbol = this.readSymbol();
                strBuffer.append(symbol);
            }
            catch (ReaderException ex) {
                throw ex;
            }
        }
        return strBuffer;
    }

}
