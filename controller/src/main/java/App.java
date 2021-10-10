import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter in the format first name then last name of the author whose books you are looking for, " +
                "separated by a space.\nExample: Fedor Dostoevsky");
        Scanner reader = new Scanner(System.in);
        String authorName = reader.nextLine();
        FabricLibrary lib = new FabricLibrary();
        Library library = lib.createLibraryFromFile("authors_and_books.json");
        library.searchByAuthorName(authorName);

    }
}
