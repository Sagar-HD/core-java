package com.xworkz.impl;

import com.xworkz.interfaces.Library;

public class LibraryImpl implements Library {
    public void issueBook() { System.out.println("Book issued"); }
    public void returnBook() { System.out.println("Book returned"); }
    public void searchBook() { System.out.println("Searching book"); }
}