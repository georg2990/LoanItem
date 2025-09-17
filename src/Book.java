public class Book extends loanItem {
    public Book(String title, String type) {
        super(title, type);

    }

    @Override
    public String getType() {
        return "Book";
    }

    @Override
    public String getName() {
        return "Title";
    }

    @Override
    public String toString(){
        return "Book" + "Title";
    }
}
