package com.example;


import java.util.Scanner;

public class Service extends Message {

    String itemThree = "SVC";
    String priorityString;
    String _originatingAD;
    String _serviceMessage;
    

    public Service() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Originating Aerodrome: ");
        _originatingAD = scanner.nextLine();    
        System.out.print("Please enter Service Message: ");
        _serviceMessage = scanner.nextLine();   
    }
    public String giveDeparture() {
        return "(" + itemThree + "-" + _originatingAD + "-"  + _serviceMessage + ")";
    }
    
}


