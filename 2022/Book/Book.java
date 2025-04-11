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

class Textbook extends Book {
    private int edition;
    
    public Textbook(String textbookTitle, double textbookPrice, int version) {
        super(textbookTitle, textbookPrice);
        edition = version;
    }
    public int getEdition() {
        return edition;
    }
    
    public String getBookInfo() {
        return super.getBookInfo + "-" + edition;
    }
    
    public boolean canSubstituteFor(Textbook obj) {
        if (obj.getTitle() == this.getTitle() && edition >= obj.getEdition()) {
            return true;
        }
        return false;
    }
}
