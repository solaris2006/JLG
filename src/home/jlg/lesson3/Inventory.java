package home.jlg.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {

    private List<Book> availableBooks;

    private Map<String, List<Book>> reservedBooksByUsername;

    public Inventory(){

    }

    public Inventory(List<Book> availableBooks, Map<String, List<Book>> reservedBooksByUsername) {
        this.availableBooks = new ArrayList<>();
        this.reservedBooksByUsername = new HashMap<>();
    }

    public void reserveBook(String user, Book book){

        if (reservedBooksByUsername.containsKey(user.toLowerCase())){
            if (!reservedBooksByUsername.get(user).contains(book)){
                reservedBooksByUsername.get(user).add(book);
            }else {
                System.out.println("User  already has lent the book");
            }
        }else {
            List<Book> newBookList = new ArrayList<>();
            newBookList.add(book);
            reservedBooksByUsername.put(user, newBookList);
        }
    }
}
