package teksystems.com;

public class AdultUser implements LibraryUser {

    //Fields
    int age;
    String bookType;

    //Constructor
    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //Methods
    @Override
    public String registerAccount() {
        if (age > 12)
            return "You have successfully registered under an Adult Account";
        else
            return "Sorry, Age must be greater than 12 to register as an adult.";
    }//registerAccount()

    public String requestBook() {
        if (bookType == "Fiction")
            return "Book issued successfully, please return the book within 7 days.";
        else
            return "Oops, you are allowed to take only adult Fiction books";
    }//requestBook()

}//AdultUser
