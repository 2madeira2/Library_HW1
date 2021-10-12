import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FabricLibrary {

    static Library lib = new Library();


    public Library createLibraryFromFile(@NotNull String path) throws IOException {
        Book[] books;
        StringBuilder line = new StringBuilder();
        try {
            FileReader reader = new FileReader(path);
            Scanner br = new Scanner(reader);

            while (br.hasNextLine()) {
                line.append(br.nextLine());
            }

            br.close();
            reader.close();
            Gson gson = new Gson();
            books = gson.fromJson(line.toString(), Book[].class);
            for (Book book : books){
                lib.addBook(book);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File do not exist, sorry");
        }
        return lib;

    }


    public Library createLibraryFromFile() throws IOException {
        String path = "authors_and_books.json";
        return createLibraryFromFile(path);
    }

}
