/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, String bookRefNumber, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        setRefNumber(bookRefNumber);
        borrowed = 0;
        courseText = bookCourseText;
    }

    // Add the methods here ...
    /**
     *  get author
     */
    public String getAuthor()
    {
        return author;
    }
    /**
     * get title
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * get Pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /**
     * print author
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    /**
     * print title
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    public void printDetails()
    {
        if ( refNumber.length() >= 3)
        {
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber + ", Borrowed: " + getBorrowed());
        }
        else
        {
            refNumber = "ZZZ";
            System.out.println("Title: " + title + ", Author: " + author + ", Pages: " + pages + ", Reference Number: " + refNumber + ", Borrowed: " + getBorrowed());
        }
        
    }
    public void setRefNumber(String ref)
    {
        if ( ref.length() >= 3 )
        {
            refNumber = ref;
        }
        else
        {
            refNumber = "";
        }
    }
    public String getRefNumber()
    {
        return refNumber;
    }
    public void borrow()
    {
        borrowed += 1;
    }
    public int getBorrowed()
    {
        return borrowed;
    }
    public boolean isCourseText()
    {
        return courseText;
    }
    
    
    
}





