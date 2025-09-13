package com.example;


import java.util.Scanner;

public class Departure extends Message {

    String itemThree = "DEP";
    String priorityString;
    String _itemSeven;
    String _itemThirteen;
    String _itemSixteen;
    String _itemEighteen;

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
    public String giveDeparture() {
        return "(" + itemThree + "-" + _itemSeven + "-"  + _itemThirteen +  "-" + _itemSixteen  + "-" + _itemEighteen + ")";
    }
    
}
