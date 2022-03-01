package teksystems.com;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        createKidUsers();
        createAdultUsers();
    }//main

    private static void createKidUsers() {
    KidUser charlie = new KidUser(10, "Kids");
        System.out.printf("Charlie's registration: %s\n", charlie.registerAccount());
        System.out.printf("Charlie's checkout: %s\n", charlie.requestBook());
    KidUser linus = new KidUser(18, "Fiction");
        System.out.printf("Linus' registration: %s\n", linus.registerAccount());
        System.out.printf("Linus' checkout: %s\n", linus.requestBook());
    }//createKidUsers()

    private static void createAdultUsers() {
        AdultUser homer = new AdultUser(5, "Kids");
        System.out.printf("Homer's registration: %s\n", homer.registerAccount());
        System.out.printf("Homer's checkout: %s\n", homer.requestBook());
        AdultUser marge = new AdultUser(23, "Fiction");
        System.out.printf("Marge's registration: %s\n", marge.registerAccount());
        System.out.printf("Marge's checkout: %s\n", marge.requestBook());
    }//createAdultUsers()

}//LibraryInterfaceDemo
