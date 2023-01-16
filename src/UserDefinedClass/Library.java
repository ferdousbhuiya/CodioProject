package UserDefinedClass;

import java.util.ArrayList;

/**
 *
 *Exercise 4
 * You are given code for the Library class (in its own file).
 * This is a composite class. You are going to create the Book
 * class (the component class) in Book.java file.
 * Look over the Library class carefully to determine what
 * attributes are needed for the Book class. In addition,
 * the table of output contains a hint as to what method the
 * Book class needs.
 *
 * Expected Output
 * To check your work, open the Exercise4.java file and enter
 * the following code samples. Be sure your output matches the
 * given output for each scenario.
 *
 */
class Library {

    private ArrayList<Book> books;
    private ArrayList<Book> fiction;
    private ArrayList<Book> nonfiction;

    /**
     * Default contstructor
     */
    public Library() {
        books = new ArrayList<Book>();
        fiction = new ArrayList<Book>();
        nonfiction = new ArrayList<Book>();
    }

    /**
     * Getter for books
     */
    public ArrayList<Book> getBooks() {
        return books;
    }

    /**
     * Getter for fiction
     */
    public ArrayList<Book> getFiction() {
        return fiction;
    }

    /**
     * Getter for nonfiction
     */
    public ArrayList<Book> getNonfiction() {
        return nonfiction;
    }

    /**
     * Takes a Book object and adds it to books
     */
    public void addBook(Book b) {
        books.add(b);
    }

    /**
     * Takes a string and returns a boolean
     */
    public boolean searchTitle(String title) {
        boolean hasBook = false;
        for (Book b : books) {
            if (title.toLowerCase().equals(b.getTitle().toLowerCase())) {
                hasBook = true;
            }
        }
        return hasBook;
    }

    /**
     * Takes a string and returns an ArrayList of Book objects
     */
    public ArrayList<Book> searchAuthor(String author) {
        ArrayList<Book> authorBooks = new ArrayList<Book>();
        for (Book b : books) {
            if (author.toLowerCase().equals(b.getAuthor().toLowerCase())) {
                authorBooks.add(b);
            }
        }
        return authorBooks;
    }

    /**
     * Helper method that calls sortFiction and sortNonfiction
     */
    public void sortBooks() {
        fiction = sortFiction();
        nonfiction = sortNonfiction();
    }

    /**
     * Returns an ArrayList of Book objects where the gengre is fiction
     */
    private ArrayList<Book> sortFiction() {
        ArrayList<Book> fictionBooks = new ArrayList<Book>();
        for (Book b : books) {
            if (b.getGenre().toLowerCase().equals("fiction")) {
                fictionBooks.add(b);
            }
        }
        return fictionBooks;
    }

    /**
     * Returns an ArrayList of Book objects where the gengre is nonfiction
     */
    private ArrayList<Book> sortNonfiction() {
        ArrayList<Book> nonfictionBooks = new ArrayList<Book>();
        for (Book b : books) {
            if (b.getGenre().toLowerCase().equals("nonfiction")) {
                nonfictionBooks.add(b);
            }
        }
        return nonfictionBooks;
    }

    class Book {
        private String title;
        private String author;
        private String genre;

        public Book(String t, String a, String g) {
            title = t;
            author = a;
            genre = g;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getGenre() {
            return genre;
        }

        public String toString() {
            return getClass().getName() + "[title=" + title + ", author=" + author + ", genre=" + genre + "]";
        }
    }
}
