package com.obss.jss.day3.streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter1 {

    public static void main(String[] args) throws IOException {
       readFile();
      //  writeToFile();

    }

    private static void readFile() throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/yrazlik/Projects/jss2022/JSS2022/src/com/obss/jss/day3/streams/filereader.txt");
            int i = 0;
            while((i = reader.read())!=-1) {
                System.out.print((char)i);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.toString());
        } catch (IOException e) {
            System.err.println("Cannot read file: " + e.toString());
        } finally {
            if(reader != null) {
                reader.close();
            }
        }
    }

    private static void writeToFile() throws IOException {
        FileWriter writer = null;

        try {
            writer = new FileWriter(
                    "/Users/yrazlik/Projects/jss2022/JSS2022/src/com/obss/jss/day3/streams/filereader.txt",
                    true);
            writer.write("\noooooooooo");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
        	  e.printStackTrace();
		}finally {
            if(writer != null) {
                writer.close();
            }
        }
    }
}
