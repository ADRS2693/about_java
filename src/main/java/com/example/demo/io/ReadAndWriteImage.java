package com.example.demo.io;

import java.io.*;

public class ReadAndWriteImage {
    //TODO
    /*
        1.
     */
    static byte[] bytes;
    public static void  main( String[] args){
        readFileIntoArray("java.png");
        writeArrayImage("newJava.png");
    }
    static void readFileIntoArray(String filename){
        File file = new File(filename);
        long length = file.length();
        FileInputStream fileInputStream = null;

        try{
            fileInputStream = new FileInputStream(file);
            int intLength = (int) length;
            bytes = new byte[intLength];
            fileInputStream.read(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileInputStream.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static void writeArrayImage(String filename){
        File file = new File(filename);
        FileOutputStream outputStream = null;

        try{
            outputStream = new FileOutputStream(file);
            outputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            try{
                outputStream.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
