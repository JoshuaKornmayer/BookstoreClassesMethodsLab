import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Bookstore {

    private ArrayList<String> titles;
    public Scanner userInput = new Scanner(System.in);

    private String name;
    private String address;
    private double sqFeet;
    private boolean hasUsedBooks;
    private boolean isOpen;
    private boolean openOnWeekends;
    private boolean openOnSundays;
    private String openingTime;
    private String closingTime;

    private void loadTitles() {
        try {
            Utils.loadStringsToArray(this.titles);
        } catch (IOException e) {
            // for now simply init the array to zero
            System.out.println("Could not initilize the titles");
            // make sure it is empty
            this.titles = new ArrayList<String>();

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Our bookstore is called " + name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("Our address is " + address);
    }

    public void getIsOpen() {
        if (isOpen == true) {
            System.out.println("Yes! We are open!");
        } else {
            System.out.println("No, I'm sorry we are not.");
        }
        // return isOpen;
    }

    public void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
        if (isOpen == true) {
            System.out.println("Yes! We are open!");
        } else {
            System.out.println("No, I'm sorry we are not.");
        }
    }

    public String getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(String closingTime) {
        this.closingTime = closingTime;
        System.out.println("We close everyday at " + closingTime);
    }

    public double getSqFeet() {
        return sqFeet;
    }

    public void setSqFeet(double sqFeet) {
        this.sqFeet = sqFeet;
        System.out.println("Our store is " + sqFeet + " square feet total.");
    }

    public boolean getHasUsedBooks() {
        return hasUsedBooks;
    }

    public void setHasUsedBooks(boolean hasUsedBooks) {
        this.hasUsedBooks = hasUsedBooks;
        if (hasUsedBooks == true) {
            System.out.println("Yes! We have new AND used books!");
        } else {
            System.out.println("No, I'm sorry we don't have any used books.");
        }
    }

    public void getTitles() {
        for (String items : titles) {
            System.out.println(items);
        }

        // for(int i = 0; i < titles.size(); i++){
        // System.out.println(titles.get(i));
        // }
    }

    public void getNumberOfBooks() {
        System.out.println("We have " + titles.size() + " books for sale.");
    }

    public void searchBooks() {
        int count = 0;
        System.out.println(
                "Would you like to search for a particular book using a title(type in 'title') or keyword(type in 'keyword')?");
        String response = userInput.nextLine();
        if (response.equalsIgnoreCase("title")) {
            System.out.println("Enter the name of the book title you are searching for!");
            String bookTitle = userInput.nextLine().toLowerCase();
            titles.replaceAll(String::toLowerCase);
            if (titles.contains(bookTitle)) {
                System.out.println("Yes, we have that book at our store available for purchase!");
            } else {
                System.out.println("I'm sorry, it doesn't appear that we have that book at our store.");
            }

        } else if (response.equalsIgnoreCase("keyword")) {
            System.out.println("Search our books by entering a specific keyword!");
            String bookKeyword = userInput.nextLine().toLowerCase();

            // for(int i = 0; i < titles.size(); i++){
            // if (titles.get(i).contains(bookKeyword)){
            // System.out.println()
            // }
            // }
            titles.replaceAll(String::toLowerCase);
            for (String string : titles) {
                if (string.contains(bookKeyword)) {
                    System.out.println("Here's a book we found with your keyword in the title: " + string);
                    count++;
                }

            }
            if (count == 0) {
                System.out.println("We're sorry, we couldn't find any book titles containing your keyword!");
            }
        } else {
            System.out.println(
                    "We couldn't recognize the command you typed it. Please make sure to enter in a valid command or type in the correct commands exactly. Thank you!");
        }
    }

    public Bookstore(String name, String address, boolean isOpen, String closingTime, double sqFeet,
            boolean hasUsedBooks) {

        this.setName(name);
        this.setAddress(address);
        this.setIsOpen(isOpen);
        this.setClosingTime(closingTime);
        this.setSqFeet(sqFeet);
        this.setHasUsedBooks(hasUsedBooks);

        titles = new ArrayList<String>();
        loadTitles();
    }

}