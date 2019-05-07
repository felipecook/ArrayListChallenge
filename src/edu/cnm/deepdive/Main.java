package edu.cnm.deepdive;

import static edu.cnm.deepdive.MobilePhone.addContacts;
import static edu.cnm.deepdive.MobilePhone.printContacts;
import static edu.cnm.deepdive.MobilePhone.removeContacts;
import static edu.cnm.deepdive.MobilePhone.searchContacts;
import static edu.cnm.deepdive.MobilePhone.updateContacts;

import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    boolean quit = true;

    while (!quit) {

      printMenu();
      int choice = scanner.nextInt();
      scanner.nextLine();
      switch(choice) {
        case 0:
          printMenu();
          break;
        case 1:
          printContacts();
          break;
        case 2:
          addContacts();
          break;
        case 3:
          updateContacts();
          break;
        case 4:
          removeContacts();
          break;
        case 5:
          searchContacts();
          break;
        case 6:
          quit = false;
          break;
      }
    }

  }

  static void printMenu() {
    System.out.println("Please select your choice: ");
    System.out.println("Press 0 to re-display the choices.");
    System.out.println("Press 1 to print list of contacts.");
    System.out.println("Press 2 to add a contact.");
    System.out.println("Press 3 to update an existing contact.");
    System.out.println("Press 4 to remove a contact.");
    System.out.println("Press 5 to search/find a contact.");
    System.out.println("Press 6 to quit.");


  }


}
