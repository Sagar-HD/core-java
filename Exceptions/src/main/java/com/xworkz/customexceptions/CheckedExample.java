package com.xworkz.customexceptions;


import com.xworkz.customexceptions.exceptions.checked.MyAnotherCheckedException;
import com.xworkz.customexceptions.exceptions.checked.MyCheckedException;

import java.io.IOException;

public class CheckedExample {
    static  void createCheckedEvent(boolean data) throws MyCheckedException, MyAnotherCheckedException {
        if(data) {
            throw new MyCheckedException("my custom checked exception");
        }
        throw new MyAnotherCheckedException("mt another custom exception ");
    }

    public static void main(String[] args) {

//single catch block
        try {
            createCheckedEvent(true);
        }
        catch (Exception exception){
            System.out.println("exception is caught "+exception.getMessage());
        }

//multiple catch block
        try{
            createCheckedEvent(true);
        } catch (MyCheckedException exception) {
            System.out.println("exception is caught in MyCheckedException  catch "+exception.getMessage());

        }
        catch (MyAnotherCheckedException exception){
            System.out.println("exception is caught in MyAnotherCheckedException  catch "+exception.getMessage());

        }


        //mutli line CatchBlock
        try{
            createCheckedEvent(false);

        } catch (MyCheckedException | MyAnotherCheckedException e) {

            System.out.println("exception is caught "+e.getMessage());
        }

    }
}
