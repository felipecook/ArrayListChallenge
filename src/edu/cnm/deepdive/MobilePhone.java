package edu.cnm.deepdive;

import java.util.ArrayList;

public class MobilePhone {

  public static ArrayList<Contacts> contactsArrayList = new ArrayList<>();

  public static void addContacts(Contacts contact) {
    contactsArrayList.add(contact);
  }

  public static void printContacts() {
    for (Contacts contact : contactsArrayList) {
      System.out.println(contact.getName());
      System.out.println(contact.getPhoneNumber());
      System.out.println();
    }
  }

  public static void updateContacts() {

  }

  public static void removeContacts() {

  }

  public static void searchContacts() {

  }






}
