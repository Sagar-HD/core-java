package com.xworkz.interfaces;
public interface Teacher {
    int MAX_CLASSES = 6;
    int MIN_CLASSES = 2;

    void teach();
    void assignHomework();
    void evaluateStudent();
}