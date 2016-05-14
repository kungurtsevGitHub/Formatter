package main.java; /**
 * Created by igor on 12.05.16.
 */
import main.java.it.sevenbits.formatter.Format;
import main.java.it.sevenbits.formatter.inputStream.FlReader;
import main.java.it.sevenbits.formatter.outputStream.FlWriter;
import main.java.it.sevenbits.formatter.inputStream.IReader;
import main.java.it.sevenbits.formatter.outputStream.IWriter;
import main.java.it.sevenbits.formatter.inputStream.inputExceptions.ReaderException;
import main.java.it.sevenbits.formatter.outputStream.outputException.WriterException;


import java.io.*;


public class Main {
    public static void main(String[] args) {
        String nameFileIn = ("/home/igor/IdeaProjects/Example/src/main/java/Input.txt");
        String nameFileOut = ("/home/igor/IdeaProjects/Example/src/main/java/Output.txt");
        try {
            FileInputStream fileInputStream = new FileInputStream(nameFileIn);
            IReader reader =new FlReader(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(nameFileOut);
            IWriter writer =new FlWriter(fileOutputStream);

            Format formatter = new Format();
            formatter.formate(reader, writer);

            fileOutputStream.flush();
            fileInputStream.close();
            fileOutputStream.close();
        }
        catch (ReaderException ex) {
            ex.getMessage();
        }
        catch (WriterException ex) {
            ex.getMessage();
        }
        catch (FileNotFoundException ex) {
            System.err.println("File didn't found");
        }
        catch (IOException ex) {
            System.err.println("File don't closed");
        }
    }
}
