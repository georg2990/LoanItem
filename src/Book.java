// underklasse for book der arver fra loanItem
public class Book extends loanItem {

    // constructor der kalder fra superklassen constructor
    public Book(int ID, String title, String type) {
        super(ID, title, type);

    }

    @Override
    public String getType() {
        return "Book";
    }
}
