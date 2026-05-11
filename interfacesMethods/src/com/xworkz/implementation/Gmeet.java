
package com.xworkz.implementation;

import com.xworkz.interfaces.OnlineTool;

public class Gmeet implements OnlineTool {

    @Override
    public void login() {
        System.out.println("Logged into Gmeet");
    }

    @Override
    public void logout() {
        System.out.println("Logged out from Gmeet");
    }

    public static void main(String[] args) {

        OnlineTool onlineTool = new Gmeet();

        OnlineTool.staticInfo();
        onlineTool.toolInfo();
        onlineTool.toolDetails();
        onlineTool.login();
        onlineTool.logout();
    }
}