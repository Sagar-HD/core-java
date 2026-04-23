package com.xworkz;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
    public static void main(String[] args)  {

       try(FileWriter fw=new FileWriter("sagar.txt")){
           fw.append("sagar is a problem solver");
       }
       catch(IOException e){
           System.out.println(e);
       }

    }
}
