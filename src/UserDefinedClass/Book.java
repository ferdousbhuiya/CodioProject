package UserDefinedClass;

/**
 *
 *Exercise 4
 * You are given code for the Library class (in its own file).
 * This is a composite class. You are going to create the Book
 * class (the component class) in Book.java file.
 * Look over the Library class carefully to determine
 * what attributes are needed for the Book class.
 * In addition, the table of output contains a hint as to
 * what method the Book class needs.
 *
 *
 * Expected Output
 * To check your work, open the Exercise4.java file
 * and enter the following code samples. Be sure your
 * output matches the given output for each scenario.
 *
 *
 */
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


