package com.example;

import java.util.Scanner;

public class Service extends Message {

    //Attributes specific to Service message
    String itemThree = "SVC";
    String priorityString;
    String _originatingAD;
    String _serviceMessage;

    //Constructor to get the required information from the user
    public Service() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Originating Aerodrome: ");
        _originatingAD = scanner.nextLine();
        System.out.print("Please enter Service Message: ");
        _serviceMessage = scanner.nextLine();
    }

    //Method to return the formatted Service message
    public String giveDeparture() {
        return "(" + itemThree + "-" + _originatingAD + "-" + _serviceMessage + ")";
    }

}
