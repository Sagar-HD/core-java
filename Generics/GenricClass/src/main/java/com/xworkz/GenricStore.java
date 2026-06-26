package com.xworkz;

public class GenricStore<T> {
     Object[] store=new Object[10];
    int index=0;

    void save(T item){
        if(index<store.length && item!=null){
            store[index]=item;
            index++;

        }
    }
    void displayAll(){
        for(int i=0;i<index;i++){

            System.out.println(store[i]);
        }
    }

    public static void main(String[] args) {
        GenricStore<Integer> intStore=new GenricStore<>();
        intStore.save(1);
        intStore.save(2);
        intStore.displayAll();
        GenricStore<String> stringStore=new GenricStore<>();
        stringStore.save("sagar");
        stringStore.save("luffy");
        stringStore.save("zoro");
        stringStore.displayAll();
    }


}
