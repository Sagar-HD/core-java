package com.xworkz.impl;

import com.xworkz.interfaces.*;

public class Runner {
    public static void main(String[] args) {

        Student s = new StudentImpl();
        s.study();
        s.takeExam();
        s.checkResult();
        System.out.println("Student: " + Student.MAX_MARKS + ", " + Student.PASS_MARKS);

        Teacher t = new TeacherImpl();
        t.teach();
        t.assignHomework();
        t.evaluateStudent();
        System.out.println("Teacher: " + Teacher.MAX_CLASSES + ", " + Teacher.MIN_CLASSES);

        Library l = new LibraryImpl();
        l.issueBook();
        l.returnBook();
        l.searchBook();
        System.out.println("Library: " + Library.MAX_BOOKS + ", " + Library.FINE_PER_DAY);

        BankAccount b = new BankAccountImpl();
        b.deposit();
        b.withdraw();
        b.checkBalance();
        System.out.println("Bank: " + BankAccount.MIN_BALANCE + ", " + BankAccount.INTEREST_RATE);

        Vehicle v = new VehicleImpl();
        v.start();
        v.stop();
        v.accelerate();
        System.out.println("Vehicle: " + Vehicle.MAX_SPEED + ", " + Vehicle.WHEELS);

        Employee e = new EmployeeImpl();
        e.work();
        e.attendMeeting();
        e.submitReport();
        System.out.println("Employee: " + Employee.WORK_HOURS + ", " + Employee.LEAVES);

        Hospital h = new HospitalImpl();
        h.admitPatient();
        h.dischargePatient();
        h.provideTreatment();
        System.out.println("Hospital: " + Hospital.MAX_PATIENTS + ", " + Hospital.DOCTORS);

        OnlinePayment op = new OnlinePaymentImpl();
        op.pay();
        op.refund();
        op.checkStatus();
        System.out.println("Payment: " + OnlinePayment.LIMIT + ", " + OnlinePayment.TRANSACTION_FEE);

        ShoppingCart sc = new ShoppingCartImpl();
        sc.addItem();
        sc.removeItem();
        sc.checkout();
        System.out.println("Cart: " + ShoppingCart.MAX_ITEMS + ", " + ShoppingCart.DISCOUNT);

        SmartDevice sd = new SmartDeviceImpl();
        sd.powerOn();
        sd.powerOff();
        sd.performTask();
        System.out.println("Device: " + SmartDevice.BATTERY_CAPACITY + ", " + SmartDevice.WARRANTY_YEARS);
    }
}