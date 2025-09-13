package com.example;

import java.util.Scanner;

public class Departure extends Message {

    //Attributes specific to Departure message
    String itemThree = "DEP";
    String priorityString;
    String _itemSeven;
    String _itemThirteen;
    String _itemSixteen;
    String _itemEighteen;

    //Constructor to get the required information from the user
    public Departure() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Item 7: ");
        _itemSeven = scanner.nextLine();
        System.out.print("Please enter Item 13: ");
        _itemThirteen = scanner.nextLine();
        System.out.print("Please enter Item 16: ");
        _itemSixteen = scanner.nextLine();
        System.out.print("Please enter Item 18 (DOF only): ");
        _itemEighteen = scanner.nextLine();

    }

    //Method to return the formatted Departure message
    public String giveDeparture() {
        return "(" + itemThree + "-" + _itemSeven + "-" + _itemThirteen + "-" + _itemSixteen + "-" + _itemEighteen
                + ")";
    }

}
