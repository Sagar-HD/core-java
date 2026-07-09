package com.xworkz.myfunctionalinterfaces.lamdbaimplementation;

import com.xworkz.myfunctionalinterfaces.nonprimitive.*;
import com.xworkz.myfunctionalinterfaces.primitiveandvoid.GetCube;
import com.xworkz.myfunctionalinterfaces.primitiveandvoid.GetHalf;
import com.xworkz.myfunctionalinterfaces.primitiveandvoid.IsEven;
import com.xworkz.myfunctionalinterfaces.primitiveandvoid.Sum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //primitive
        Sum sum=(num1,num2)->num1+num2;
        System.out.println(sum.add(1,2));

        IsEven isEven=(num)->num%2==0;
        System.out.println(isEven.check(2));
        System.out.println(isEven.check(1));

        GetHalf getHalf=(num)->num/2;
        System.out.println(getHalf.divideBy2(4));

        GetCube getCube=(num)->num*num*num;
        System.out.println(getCube.cube(3));



        //non primitive and array
         GetnewGod getnewGod=()->new God("anonymous",false);
         God newGod=getnewGod.getGod();

        GiveGods giveGods=(noOfGods)->{
            God[] gods=new God[noOfGods];
            for(int i=0;i<noOfGods;i++){
                gods[i]=new God("anonymous",false);
            }
            return gods;
        };
        God[] gods=giveGods.giveGods(5);


        GodnameLength godnameLength=(god)->god.getName().length();
        System.out.println(godnameLength.getNameLength(newGod));

        IsFakeGod isFakeGod=(god)->!god.isCanDoEverything();

        System.out.println(isFakeGod.isFake(newGod));

        IsTrueGod isTrueGod=(god)->god.isCanDoEverything();

        System.out.println(isTrueGod.isTrue(newGod));

        //
        God god2=new God("shiva",true);

        TwoGodsAreTrue twoGodsAreTrue=(firstGod,secondGod,godPredicate)-> isTrueGod.isTrue(firstGod)&& isTrueGod.isTrue(god2);

        System.out.println(" are these both gods true "+twoGodsAreTrue.check(newGod,god2,isTrueGod));

        IsAnyGodFake isAnyGodFake=(god1,god3,isFakeGod2)->isFakeGod2.isFake(god1)||isFakeGod2.isFake(god3);


        System.out.println(" is anyone fake "+isAnyGodFake.check(newGod,god2,isFakeGod));

        GetGodChecker getGodChecker=(field)->{
            if(field.equals("name")){
                return (god)->god.getName().equals("sagar");
            }
            else{
                return (god)->god.isCanDoEverything();
            }
        };
        Predicate<God> isGodTrueBasedOnField=getGodChecker.get("name");
        System.out.println(" is god true based on name "+isGodTrueBasedOnField.test(newGod));



        }


    }
