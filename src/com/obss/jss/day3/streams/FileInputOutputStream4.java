package com.obss.jss.day3.streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream4 {

    public static void main(String[] args) throws IOException {
        readFile();
        writeToFile();
    }

    private static void readFile() throws IOException {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("/Users/yrazlik/IdeaProjects/JavaSummerSchool/src/com/obss/jss/day3/streams/fileinputstream.txt");
            int i = 0;
            while((i = fis.read())!=-1){
                System.out.print((char)i);
            }
        } catch(Exception e){
            System.err.println(e);
        } finally {
            if(fis != null) {
                fis.close();
        }
    }
}

    private static void writeToFile() throws IOException {
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream(
                    "/Users/yrazlik/IdeaProjects/JavaSummerSchool/src/com/obss/jss/day3/streams/fileinputstream.txt",
                    true);
            String newText = "\nNew Text";
            byte b[]= newText.getBytes();
            fos.write(b);
            fos.flush();
        } catch(Exception e){
            System.err.println(e);
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
}
