package edu.cnm.deepdive;


import java.util.Scanner;

public class Main {

  private static Scanner scanner = new Scanner(System.in);
  private static MobilePhone mobilePhone = new MobilePhone("5052704597");

  public static void main(String[] args) {

    boolean quit = false;
    startPhone();
    printMenu();

    while (!quit) {
      System.out.println("\nEnter action: (Press 0 to redisplay available choices)");
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 0:
          printMenu();
          break;
        case 1:
          mobilePhone.printContacts();
          break;
        case 2:
          System.out.println("Please enter the Name of the contact: ");
          String name = scanner.nextLine();
          scanner.nextLine();
          System.out.println("Please enter the Number of the contact: ");
          String number = scanner.nextLine();
          scanner.nextLine();
          mobilePhone.addContacts(new Contact(name, number));
          System.out.println("Contact has been created.");
          break;
        case 3:
//          System.out.println("Please enter the position of the contact you wish to update");
//          int position = scanner.nextInt();
//          System.out.println("Please enter the contact you wish to update with.");
//          String contact = scanner.nextLine();
//          updateContacts(position, contact);
          break;
        case 4:
          int position = scanner.nextInt();
          scanner.nextLine();
          mobilePhone.removeContacts(Contact.createContact());
          break;
        case 5:
          System.out.println("Please enter the name and number you are trying to query");

          mobilePhone.queryContact(Contact.createContact());
          break;
        case 6:
          System.out.println("\nShutting down...");
          quit = true;
          break;
      }
    }

  }

  private static void printMenu() {
    System.out.println("Please select your choice: ");
    System.out.println("Press 0 to re-display the choices.");
    System.out.println("Press 1 to print list of contacts.");
    System.out.println("Press 2 to add a contact.");
    System.out.println("Press 3 to update an existing contact.");
    System.out.println("Press 4 to remove a contact.");
    System.out.println("Press 5 to search/find a contact.");
    System.out.println("Press 6 to quit.");
  }

  private static void startPhone() {
    System.out.println("Phone is starting...");
  }


}
