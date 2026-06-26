package com.xworkz;

public class GenericClass2<T,U,V>{
    T type1;
    U type2;
    V type3;
    public GenericClass2(T type1, U type2, V type3 ){
        this.type1=type1;
        this.type2=type2;
        this.type3=type3;
    }


    public T getType1() {
        return type1;
    }

    public V getType3() {
        return type3;
    }

    public U getType2() {
        return type2;
    }

    public static void main(String[] args) {
        GenericClass2<String,Integer,Boolean> box1=new GenericClass2<>("sagar",21,true);
        System.out.println(box1.type1);
        System.out.println(box1.type2);
        GenericClass2<String,String,String> box2=new GenericClass2<>("sagar","zoro","luffy");
        System.out.println(box2.type1);
        System.out.println(box2.type2);
    }
}
