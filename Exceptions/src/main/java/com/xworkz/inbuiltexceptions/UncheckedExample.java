package com.xworkz.inbuiltexceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UncheckedExample {
    static void createUncheckedEvent(int val){
        int a=3;
        int ans=a/val;
        //this will cause  array index out of bound
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]);

    }

    public static void main(String[] args) {
        //single catch
        try{
            createUncheckedEvent(2);
        }
        catch (Exception e){

            System.out.println("exception in single catch block"+e.getMessage());
        }

        //multiple block
        try{
            createUncheckedEvent(0);
        } catch (ArithmeticException e) {
            System.out.println("exception in multiple catch block in arithmetic "+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("exception in multiple catch block in arrayIndex out of bound "+e.getMessage());
        }
        //multi line
        try{
            createUncheckedEvent(10);
        }
        catch (ArithmeticException |ArrayIndexOutOfBoundsException e){
            System.out.println("exception in multi line comment "+e.getClass());
        }
    }

}
