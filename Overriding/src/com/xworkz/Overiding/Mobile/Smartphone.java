package com.xworkz.Overiding.Mobile;

public class Smartphone extends Mobile {
    @Override
    public void unlock() {
        System.out.println("Unlock using FaceID or Fingerprint");
    }
}