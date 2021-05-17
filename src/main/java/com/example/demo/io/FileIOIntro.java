package com.example.demo.io;

import java.io.*;
import java.util.Scanner;

public class FileIOIntro {
    public static void main(String[] args) throws IOException {
        //createAndVerifyFile();
        /*try{
        //writeAndReadFile();
        File file = new File("Data.txt");
        //readTheFile(file);}
        catch (IOException e){
            System.out.println(e.getMessage());
        }*/
    }
    public static void createAndVerifyFile(){
        //create a simple file
        File file = new File("Data.txt");
        try{
            boolean fileVariable = file.createNewFile();
            if(fileVariable) {
                System.out.println("File has been created");
            }
            else{
                System.out.println("File has not been created");
            }
        }
        catch(IOException ex){
            System.out.println("File not created.");
        }
        finally {
            file.delete();
        }
    }
    public static void writeAndReadFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try{
            File file = new File("TestData.txt");
            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);
            bufferedWriter = new BufferedWriter(writer);

            bufferedWriter.write("This is a file you wrote");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally {
            if (bufferedWriter != null){
                bufferedWriter.close();
            }
        }
    }
    public static void readTheFile(File file) throws FileNotFoundException {
        FileReader reader = new FileReader(file);
        try{
            BufferedReader bufferedReader= new BufferedReader(reader);
            String fileContent = "";
            while((fileContent = bufferedReader.readLine()) != null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFromScanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int numOne = scanner.nextInt();
        System.out.println("Enter the second number.");
        int numTwo = scanner.nextInt();
        System.out.println("Sum of two numbers = " + (numOne + numTwo));
    }
}
