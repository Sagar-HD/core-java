
package com.xworkz.interfaces;

public interface OnlineTool {

    int users = 1000;
    String platform = "Web";
    String purpose = "Communication";

    void login();
    void logout();

    default void toolInfo() {
        System.out.println("Online tools help communication");
    }

    default void toolDetails() {
        System.out.println("Users: " + users);
        System.out.println("Platform: " + platform);
        System.out.println("Purpose: " + purpose);
    }

    static void staticInfo() {
        System.out.println("I am OnlineTool Interface");
    }
}