package com.example.demo.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class MultiThreadFileIO {
    public static void main(String[] args) throws IOException, InterruptedException {
        final PipedInputStream inputStream = new PipedInputStream();
        final PipedOutputStream outputStream = new PipedOutputStream();

        //Connet the reader and writer
        inputStream.connect(outputStream);
        Thread reader = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 65; i < 91; i++) {
                    try {
                        System.out.println((char) inputStream.read());
                        Thread.sleep(500);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread writer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 65; i< 91; i++) {
                    try {
                        outputStream.write(i);
                        Thread.sleep(500);
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        writer.run();
        reader.run();
        //join and wait
        writer.join();
        reader.join();
        //close
        inputStream.close();
        outputStream.close();
    }
}
