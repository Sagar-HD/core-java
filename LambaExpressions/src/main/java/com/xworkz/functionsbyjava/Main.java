package com.xworkz.functionsbyjava;

import java.util.function.*;

public class Main {
    static  class Student{
        private String name;
        private int age;

        public Student(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) {

        //
        Consumer<String> takeString=(input)-> System.out.println(input);
        Supplier<Integer> giveInt=()->24;
        Predicate<Integer> iseven=(num)->num%2==0;
        Function<Integer,Integer> giveSquare=(num)->num*num;
        //

        BiConsumer<String,Integer> printNameAndAge=(name,age)-> System.out.println("name :"+name+" age"+age);
        BiPredicate<Integer,String> checkNameAndAgeValid=(age,name)->(age>=18 && name.length()>=5);
        BiFunction<String,Integer,String> concatNameAndAge=(name,age)->name+age;
        //
        UnaryOperator<Integer> ageAgeAfter10yrs=(age)->age=10;//extends function , function which has same paramater and return type
        BinaryOperator<String> concatTwonames=(name1,name2)->name1+name2;//extends bi function , bi function with same inputs and output
        //
        IntConsumer intDisplay=(num)-> System.out.println(num);
        LongConsumer longDisplay=(num)-> System.out.println(num);
        DoubleConsumer doubleConsumer=(num)-> System.out.println(num);
        //
        IntSupplier getInt=()->8;
        LongSupplier getLong=()->10L;
        DoubleSupplier getDouble=()->12.0D;
        //
        IntPredicate isLessthan10=(num)->num<10;
        LongPredicate isA10digit=(num)->num>999999999;
        DoublePredicate hasDecimal=(num)->num!=Math.round(num);//rounding and returning if its same or not
        //
        IntFunction<String> intToString=(num)->num+"";
        LongFunction<Boolean> isLongValid10digit=(num)-> num>999999999;
        DoubleFunction<Integer> getRoundOff=(num)-> Math.toIntExact(Math.round(num));
        //
        IntUnaryOperator getsquareOfint=(num)->num*num;
        LongUnaryOperator getHalfOfLong=(num)->num/2;
        DoubleUnaryOperator getHalfOfDouble=(num)->num/2;
        //
        IntBinaryOperator sumOf2Int=(num1,num2)->num1+num2;
        LongBinaryOperator difOf2Long=(num1,num2)->num1-num2;
        DoubleBinaryOperator sumOf2Double=(num1,num2)->num1+num2;
        //
        IntToLongFunction convertIntToLong=(num)->num;
        IntToDoubleFunction convertIntToDouble=(num)->num;
        LongToIntFunction convertLongToInt=(num)->(int)num;
        LongToDoubleFunction convertLongToDouble=(num)->(double) num;
        DoubleToIntFunction convertDoubleToInt=(num)->(int) num;
        DoubleToLongFunction convertDoubleToLong=(num)->(long) num;
        //
        ObjIntConsumer<String>  displayObjectAndInt=(name,age)-> System.out.println(name+age);
        ObjLongConsumer<Student> displayStudentAndMobilenum=(student,mobile)-> System.out.println(student+" "+mobile);
        ObjDoubleConsumer<Student> displayStudentAndWeight=(student,weight)-> System.out.println(student+" "+weight);
         //
        ToIntFunction<String> getStringLen=(name)->name.length();
        ToLongFunction<Student> getDumbLong=(student)->200L;
        ToDoubleFunction<Student> getStudentAgeAsDouble=(student)-> student.age;
        //
        ToIntBiFunction<Student,Student> getTwoStudentAgeSum=(student1,student2)-> student1.age+ student2.age;
        ToLongFunction<String> getDumbLongWith2param=(student)->200L;
        ToDoubleBiFunction<Student,Student> get2studentAgeSumasDouble=(student1,student2)-> student1.age+ student2.age;




    }
}
