package com.example;

import java.awt.Point;
import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
  public static void main(String[] args) {
    //Welcoming Header
    System.out.println("Welcome to the Message Formatter");
    //Get input from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("What type of Message (FPL, DEP, SVC) or enter \"Quit\": ");
    String messageType = scanner.nextLine();
    //Loop until user wants to quit. Depeinding on the message type, create the appropriate object and get the required information from the user.
    while (!messageType.equals("Quit")) {

      //If user enters FPL, create a FlightPlan object and get the required information from the user.
      if (messageType.equals("FPL")) {
        FlightPlan flightPlan = new FlightPlan();

        System.out.print("What is the priority: ");
        String priorityString = scanner.nextLine();
        flightPlan.set_priority(priorityString);

        System.out.print("Who is the originator: ");
        String originatorString = scanner.nextLine();
        flightPlan.set_originator(originatorString);
        for (int i = 0; i < 5; i++) { 
          System.out.println();
        }
        flightPlan.displayMessage();
        System.out.println(flightPlan.giveFlightPlan());
        for (int i = 0; i < 5; i++) {
          System.out.println();
        }
        System.out.println("NNNN");
        break;
        //If user enters DEP, create a Departure object and get the required information from the user.
      } else if (messageType.equals("DEP")) {
        Departure departure = new Departure();

        System.out.print("What is the priority: ");
        String priorityString = scanner.nextLine();
        departure.set_priority(priorityString);

        System.out.print("Who is the originator: ");
        String originatorString = scanner.nextLine();
        departure.set_originator(originatorString);
        for (int i = 0; i < 5; i++) { 
          System.out.println();
        }
        departure.displayMessage();
        System.out.println(departure.giveDeparture());
        for (int i = 0; i < 5; i++) { // 5 empty lines
          System.out.println();
        }
        System.out.println("NNNN");
        break;
        //If user enters SVC, create a Service object and get the required information from the user.
      } else if (messageType.equals("SVC")) {
        Service service = new Service();

        System.out.print("What is the priority: ");
        String priorityString = scanner.nextLine();
        service.set_priority(priorityString);

        System.out.print("Who is the originator: ");
        String originatorString = scanner.nextLine();
        service.set_originator(originatorString);
        for (int i = 0; i < 5; i++) { // 5 empty lines
          System.out.println();
        }
        service.displayMessage();
        System.out.println(service.giveDeparture());
        for (int i = 0; i < 5; i++) { // 5 empty lines
          System.out.println();
        }
        System.out.println("NNNN");
        break;

        //If user enters anything else, display an error message and prompt the user to enter a valid message type or quit.
      } else {
        System.out.println("Please enter a valid message type  (FPL, DEP, SVC.");
        System.out.print("What type of Message (FPL, DEP, SVC) or enter \"Quit\": ");
        messageType = scanner.nextLine();
        break;
      }
    }
    System.out.println("Thank you for using Messanger Formatter. \n Goodbye!");

  }
}
