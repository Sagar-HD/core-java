package com.xworkz.inbuiltexceptions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    static  void createCheckedEvent() throws ClassNotFoundException, IOException {
        Class.forName("com.google.project");
        FileReader fr=new FileReader(new File("/notExist.txt"));
        int value=fr.read();
    }

    public static void main(String[] args) {

//single catch block
        try {
            createCheckedEvent();
        }
        catch (Exception exception){
            System.out.println("exception is caught "+exception.getMessage());
        }

//multiple catch block
        try{
            createCheckedEvent();
        } catch (ClassNotFoundException exception) {
            System.out.println("exception is caught in class not found catch "+exception.getMessage());

        }
        catch (IOException exception){
            System.out.println("exception is caught in io  catch "+exception.getMessage());

        }


        //mutli line CatchBlock
        try{
            createCheckedEvent();

        } catch (ClassNotFoundException | IOException e) {

            System.out.println("exception is caught "+e.getMessage());
        }

    }
}
