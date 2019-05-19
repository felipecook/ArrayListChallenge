package edu.cnm.deepdive;

import java.util.ArrayList;

public class MobilePhone {

  private String myNumber;
  private ArrayList<Contact> myContacts;

  public MobilePhone(String myNumber) {
    this.myNumber = myNumber;
    this.myContacts = new ArrayList<Contact>();
  }

  public boolean addContacts(Contact contact) {
    if (findContact(contact.getName()) >= 0) {
      System.out.println("Contact is already on file");
      return false;
    }
    myContacts.add(contact);
    return true;
  }

  private int findContact(Contact contact) {
    return this.myContacts.indexOf(contact);
  }

  public static void printContacts() {
    System.out.println("You have " + myContacts.size() + " contacts in your phone book");
    for (Contact contact : myContacts) {
      System.out.println(contact.getName());
      System.out.println(contact.getPhoneNumber());
      System.out.println();
    }
  }

  public static void updateContacts(int position, Contact contact) {
    myContacts.set(position, contact);
    System.out.println("Contact at " + (position + 1) + " has been updated.");
  }

  public static void removeContacts(int position) {
    myContacts.remove(position);
  }

  public static void searchContacts() {

  }






}
