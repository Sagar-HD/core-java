package com.xworkz.anonymousClass;

public class Runner {
    public static void main(String[] args) {
        Browser browser=new Browser();
        browser.switchTab();
        Browser browser1=new Browser(){
            @Override
            public void switchTab() {
                System.out.println("switching tab in anonymous class");
            }
        };
        browser1.switchTab();
        Jump jump=new Jump() {
            @Override
            public void jumpHigh() {
                System.out.println("jumping from anonymous class");
            }
        };
        jump.jumpHigh();
    }
}
