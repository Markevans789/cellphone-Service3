package com.pluralsight;

public class CellPhoneService {

    int serialNumber;
    String model;
    String carrier;
    String phoneNumber;
    String owner;

    // Default constructor
    public CellPhoneService() {
    }

    // Overloaded constructor
    public CellPhoneService(int serialNumber, String model,
                            String carrier, String phoneNumber,
                            String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public void dial(String phoneNumber) {
        System.out.println(owner + "'s phone is calling " + phoneNumber);
    }

    // Display method
    public static void display(CellPhoneService phone) {
        System.out.println("Serial Number: " + phone.serialNumber);
        System.out.println("Model: " + phone.model);
        System.out.println("Carrier: " + phone.carrier);
        System.out.println("Phone Number: " + phone.phoneNumber);
        System.out.println("Owner: " + phone.owner);
        System.out.println();
    }

    public static void main(String[] args) {

        // First Cell Phone
        CellPhoneService phone1 = new CellPhoneService();
        phone1.serialNumber = 1;
        phone1.model = "";
        phone1.carrier = "";
        phone1.phoneNumber = "";
        phone1.owner = "";

        // Second Cell Phone
        CellPhoneService phone2 = new CellPhoneService();
        phone2.serialNumber = 2;
        phone2.model = "";
        phone2.carrier = "";
        phone2.phoneNumber = "";
        phone2.owner = "";

        // Third Cell Phone using overloaded constructor
        CellPhoneService phone3 = new CellPhoneService(
                3,
                "Galaxy S25",
                "Verizon",
                "555"


    ;}





}