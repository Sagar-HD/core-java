package com.xworkz;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
            /*

            important observations
            1. ListIterator<Integer> itr=list.listIterator(); gives cursor index from 0
                  **imp by doing next() we get element at cursor index then cursor++
            2.ListIterator<Integer> itr= list.listIterator(list.size()); gives cursor at index or size
                  **imp but when doing previous() we get element at cursor index -1 then cursor--
                  so while doing backward cursor should be always in size() not size()-1
            3. add() method
                 first it shifts everything from its index to one position right
                 then adds element at the index cursor is pointing to
                 then it does cursor++ so it goes to next element ,it will not point to added element
                 its like adding element after the current element if we did next() then add
                 its like adding before the current element if we did previous() then add
            4. remove() method
                  remove method doesnt removes from curent cursor position
                  it maintains something called lastRet
                  it removes the last element returned by next() or previous().
                  first it remove the element at lastRet index
                  then it shifts everything from its index to one position left
                 then it does cursor-- so it goes to the element need to processed only if we remove after doing next()
                 if we remove after doing previous() it doesnt do cursor --
                 this is check by if (lastRet < cursor){ cursor --}
                 its like removing element before the current element if we did next()
                 its like removing element after the current element if we did previous()




             */



        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //print list in forward and backward
        ListIterator<Integer> itr=list.listIterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
        System.out.println();
        //using same iterator which now at end
        while(itr.hasPrevious()){
            System.out.print(itr.previous());
        }

        //replace all even number with its square
        //ill reuse same itr bcs now its in forward
        while(itr.hasNext()){
            Integer num=itr.next();
            if(num%2==0){
                itr.set(num*num);
            }
        }
        System.out.println(list);
        //add 100 after every even number
        itr=list.listIterator();
        while(itr.hasNext()){
            Integer num=itr.next();
            if(num%2==0){
                itr.add(100);
            }
        }
        System.out.println(list);

        //remove all odd numbers
        //ill reuse same itr

        while(itr.hasPrevious()){
            int num=itr.previous();
            if(num%2!=0){
             itr.remove();
            }
        }
        System.out.println(list);
//        Perform all of the following in one traversal
//        Remove odd numbers.
//        Replace every even number with even × 10.
//        Insert -1 after every modified even number.
        while(itr.hasNext()){
            Integer num=itr.next();
            if(num%2!=0){
                itr.remove();

            }
            else{
                itr.set(num*10);
                itr.add(-1);
            }
        }
        System.out.println(list);

        //while iterating if its odd add 50 to its  next position
        itr= list.listIterator(list.size());
        while(itr.hasPrevious()){
            Integer num=itr.previous();
            if(num%2!=0){
                itr.next();
                itr.add(50);


            }
        }
        System.out.println(list);

    }

}
