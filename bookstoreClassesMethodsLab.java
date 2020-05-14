import java.util.Date;

public class bookstoreClassesMethodsLab {

    public static void main(String[] args) {

        Bookstore bookStore = new Bookstore("Read More Books", "1414 S. Tryon St.", true, "5pm", 1500, false);
        Date date = new Date();
        System.out.println("Today's date is " + date);

        // System.out.println(bookStore.getName());
        // System.out.println(bookStore.getAddress());
        bookStore.getIsOpen();
        // System.out.println(bookStore.getClosingTime());
        // System.out.println(bookStore.getSqFeet());
        // System.out.println(bookStore.getHasUsedBooks());
        bookStore.getTitles();
        // bookStore.getNumberOfBooks();
        bookStore.searchBooks();
    }

}
