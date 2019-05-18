package edu.cnm.deepdive;

import java.util.ArrayList;

public class MobilePhone {

  public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();

  public static void addContacts(Contacts contact) {
    contactsArrayList.add(contact);
  }

  public static void printContacts() {
    System.out.println("You have " + contactsArrayList.size() + " contacts in your phone book");
    for (Contacts contact : contactsArrayList) {
      System.out.println(contact.getName());
      System.out.println(contact.getPhoneNumber());
      System.out.println();
    }
  }

  public static void updateContacts(int position, Contacts contact) {
    contactsArrayList.set(position, contact);
    System.out.println("Contact at " + (position + 1) + " has been updated.");
  }

  public static void removeContacts(int position) {
    contactsArrayList.remove(position);
  }

  public static void searchContacts() {

  }






}
