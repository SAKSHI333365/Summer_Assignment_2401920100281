package Week_1.OOPS;

public class KidUser implements LibraryUser {

  int age;
  String bookType;

  public KidUser(int age, String bookType) {
    this.age = age;
    this.bookType = bookType;
  }

  public void registerAccount() {

    if (age < 12) {
      System.out.println("You have successfully register under a kids Account");
    } else {
      System.out.println("Sorry, Age must be less than 12 to register as a kid");
    }
  }

  public void requestBook() {

    if (bookType.equalsIgnoreCase("kids")) {
      System.out.println("Book Issued successfully, please return the book within 10 days");
    } else {
      System.out.println("Oops,you are allowed to take only kids books");
    }
  }
}
