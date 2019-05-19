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

  private int findContact(String contactName) {
    for (int i = 0; i < this.myContacts.size(); i++) {
      Contact contact = this.myContacts.get(i);

      if (contact.getName().equals(contactName)) {
        return i;
      }
    }
    return -1;
  }

  public String queryContact(Contact contact) {
    if (findContact(contact) >= 0) {
      return contact.getName();
    }
    return null;
  }

  public void printContacts() {
    System.out.println("You have " + myContacts.size() + " contacts in your phone book");
    for (Contact contact : myContacts) {
      System.out.println(contact.getName());
      System.out.println(contact.getPhoneNumber());
      System.out.println();
    }
  }

  public boolean updateContacts(Contact oldContact, Contact newContact) {
    int foundPosition = findContact(oldContact);
    if (foundPosition < 0) {
      System.out.println(oldContact.getName() + " was not found.");
      return false;
    }

    this.myContacts.set(foundPosition, newContact);
    System.out.println(oldContact.getName() + " was updated with " + newContact.getName());
    return true;

  }

  public boolean removeContacts(Contact contact) {
    int foundPosition = findContact(contact);
    if (foundPosition < 0) {
      System.out.println(contact.getName() + " was not found.");
      return false;
    }

    this.myContacts.remove(foundPosition);
    return true;
  }


}
