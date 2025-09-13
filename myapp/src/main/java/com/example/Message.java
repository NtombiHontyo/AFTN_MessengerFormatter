package com.example;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Message {
    //Attributes common to all messages
    private String _priority;
    private String _originator;

    //List of addresses. Will loop to get multiple addresses from user according to how many they say they will enter.
    Scanner scanner = new Scanner(System.in);
    Addresses addressList = new Addresses();
    Message() {
        System.out.print("How many addresses will you enter? ");
        int count = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Enter Address " + i + ": ");
            String address = scanner.nextLine();
            addressList.addAddress(address);
        }
    }

    //Getters and Setters
    void set_priority(String priority) {
        _priority = priority;
    }

    String get_priority() {
        return _priority;
    }

    void set_originator(String originator) {
        _originator = originator;
    }

    String get_origininator() {
        return _originator;
    }

    //Get current date and time in UTC format
    ZonedDateTime utcNow = ZonedDateTime.now(ZoneOffset.UTC);

    // Extract day of the month
    int dayOfMonth = utcNow.getDayOfMonth();

    // Format hours and minutes
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmm");
    String time = utcNow.format(formatter);

    //Method to display the common parts of the message
    public void displayMessage() {
        System.out.println("ZCZC ATA0001     ");
        System.out.print(_priority + " ");
        for (String addressString : addressList.getAddresses()) {
            System.out.print(addressString + " ");

        }
        System.out.println("");
        System.out.print(dayOfMonth + time + " " + _originator);
        System.out.println("");

    }
}
