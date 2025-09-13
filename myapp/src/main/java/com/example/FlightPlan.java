package com.example;

import java.util.Scanner;

public class FlightPlan extends Message {

    //Attributes specific to Flight Plan message
    String itemThree = "FPL";
    String priorityString;
    String _itemSeven;
    String _itemEight;
    String _itemNine;
    String _itemTen;
    String _itemThirteen;
    String _itemFifteen;
    String _itemSixteen;
    String _itemEighteen;

    //Constructor to get the required information from the user
    public FlightPlan() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter Item 7: ");
        _itemSeven = scanner.nextLine();
        System.out.print("Please enter Item 8: ");
        _itemEight = scanner.nextLine();
        System.out.print("Please enter Item 9: ");
        _itemNine = scanner.nextLine();
        System.out.print("Please enter Item 10: ");
        _itemTen = scanner.nextLine();
        System.out.print("Please enter Item 13: ");
        _itemThirteen = scanner.nextLine();
        System.out.print("Please enter Item 15: ");
        _itemFifteen = scanner.nextLine();
        System.out.print("Please enter Item 16: ");
        _itemSixteen = scanner.nextLine();
        System.out.print("Please enter Item 18: ");
        _itemEighteen = scanner.nextLine();

    }

    //Method to return the formatted Flight Plan message
    public String giveFlightPlan() {
        return "(" + itemThree + "-" + _itemSeven + "-" + _itemEight + "\n" + "-" + _itemNine + "/" + _itemTen + "\n"
                + "-" + _itemThirteen + "\n" + "-" + _itemFifteen + "\n" + "-" + _itemSixteen + "\n" + "-"
                + _itemEighteen + ")";
    }

}
