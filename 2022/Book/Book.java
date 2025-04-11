/*
*    Created by: {techmoocher}
*    Date: Arpil 11, 2025
*/

/* Question 2 */

public class Book {
    private String title;
    private double price;
    public Book (String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
        // implementation not shown
    }
    public String getTitle() {
        return title;
    }
    public String getBookInfo() {
        return title + "-" + price;
    }
}
