package pl.library.app;
import pl.library.model.Book;

public class Library {
    public static void main(String[] args) {
        final String appName = "pl.library.app.Library v0.5";

        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz",
                2010, 296, "Greg", "9788373271890");

        Book book2 = new Book("Java.", "Joshua Bloch",
                2009, 352, "Helion");

//        book1.title = "W pustyni i w puszczy";
//        book1.author = "Henryk Sienkiewicz";
//        book1.releaseDate = 2010;
//        book1.pages = 296;
//        book1.publisher = "Greg";
//        book1.isbn = "9788373271890";


        System.out.println(appName);
        System.out.println("Books available in library: ");
        book1.printInfo();
        book2.printInfo();

    }
}