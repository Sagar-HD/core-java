package com.xworkz.customexceptions;


import com.xworkz.customexceptions.exceptions.unchecked.MyAnotherUncheckedException;
import com.xworkz.customexceptions.exceptions.unchecked.MyUncheckedException;

import java.util.Collection;

public class UncheckedExample {
    static  void createUncheckedEvent(boolean data){
        if(data){
            throw new MyUncheckedException("my unchecked exception");
        }
        throw new MyAnotherUncheckedException("my another unchecked exception");
    }


    public static void main(String[] args) {
        //single catch
        try{
            createUncheckedEvent(true);
        }
        catch (Exception e){

            System.out.println("exception in single catch block"+e.getMessage());
        }

        //multiple block
        try{
            createUncheckedEvent(true);
        } catch (MyUncheckedException e) {
            System.out.println("exception in multiple catch block in MyUncheckedException "+e.getMessage());
        }
        catch (MyAnotherUncheckedException e){
            System.out.println("exception in multiple catch block in MyAnotherUncheckedException "+e.getMessage());
        }
        //multi line
        try{
            createUncheckedEvent(false);
        }
        catch (MyUncheckedException |MyAnotherUncheckedException e){
            System.out.println("exception in multi line comment "+e.getMessage());
        }





    }







}
