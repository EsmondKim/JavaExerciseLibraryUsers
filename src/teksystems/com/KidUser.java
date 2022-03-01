package teksystems.com;

public class KidUser implements LibraryUser {

    //Fields
    int age;
    String bookType;

    //Constructor
    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //Methods
    @Override
    public String registerAccount() {
        if (age < 12)
            return "You have successfully registered under a Kids Account.";
        else
            return "Sorry, Age must be less than 12 to register as a kid.";
    }//registerAccount()

    public String requestBook() {
        if (bookType == "Kids")
            return "Book issued successfully, please return the book within 10 days.";
        else
            return "Oops, you are allowed to take only kids books";
    }//requestBook()

}//KidUser
