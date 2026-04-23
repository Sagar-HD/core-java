package com.xworkz;

public class BufferVsBuilder {

    public static void main(String[] args) throws InterruptedException {
        StringBuffer buffer = new StringBuffer("sagar");
        StringBuilder stringBuilder = new StringBuilder("Problem solver");
        Thread thread1 = new Thread(()->{
            int i = 1;
            while(i<1000){

                buffer.append(i);
                i++;
            }
        });
        Thread thread2 = new Thread(()->{
            int letter = 97;
            while(letter<122){

                char alpa = (char) letter;
                buffer.append(alpa);
                letter++;
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(buffer);
        Thread thread3 = new Thread(()->{
            int i = 1;
            while(i<1000){

                stringBuilder.append(i);
                i++;
            }
        });
        Thread thread4 = new Thread(()->{
            int letter = 97;
            while(letter<122){

                char alpa = (char) letter;
                stringBuilder.append(alpa);
                letter++;
            }
        });
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
        System.out.println(stringBuilder);
    }
}
