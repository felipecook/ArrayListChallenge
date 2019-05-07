package edu.cnm.deepdive;

public class Contacts {

  private static String name;
  private static String phoneNumber;



  public static String getName() {
    return name;
  }

  public static void setName(String name) {
    Contacts.name = name;
  }

  public static String getPhoneNumber() {
    return phoneNumber;
  }

  public static void setPhoneNumber(String phoneNumber) {
    Contacts.phoneNumber = phoneNumber;
  }
}
