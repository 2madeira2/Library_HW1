import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books = new ArrayList<>();


    public void addBook(@NotNull Book book){
        books.add(book);
    }


    public void searchByAuthorName(@NotNull String name){
        ArrayList<Book> requestBooks = new ArrayList<>();
        for (Book book : books){
            if((book.getAuthor().getName() + " " + book.getAuthor().getSurname()).equals(name)){
                requestBooks.add(book);
            }
        }
        if (requestBooks.isEmpty()){
            System.out.println("Sorry,there are no books by this author in our library ");
        }
        else{
            Gson gson = new Gson();
            for (Book book : requestBooks){
                System.out.println(gson.toJson(book, Book.class));
            }
        }
    }

}


