package Inheritence;

/**
 *
 * Use the superclass Book to help you solve this problem.
 * Create the subclass BlogPost so that it has the following attributes:
 * title - a string that represents the title of the blog post
 * author - a string that represents the author of the blog post
 * genre - a string that represents the genre of the blog post
 * website - a string that represents the website hosting the blog post
 * wordCount - an integer that represents the number of words in the blog post
 * pageViews - an integer that represents the page views for the blog post
 */
public class Book {

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

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        author = newAuthor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }
}

//add class definitions below this line

class BlogPost extends Book {
    private String website;
    private int wordCount;
    private int pageViews;

    public BlogPost (String t, String a, String g, String w, int wc, int pv) {
        super(t, a, g);
        website = w;
        wordCount = wc;
        pageViews = pv;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String newWebsite) {
        website = newWebsite;
    }

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int newWordCount) {
        wordCount = newWordCount;
    }

    public int getPageViews() {
        return pageViews;
    }

    public void setPageViews(int newPageViews) {
        pageViews = newPageViews;
    }
}


//add class definitions above this line

