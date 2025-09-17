public class Book extends loanItem {
    public Book(int ID, String title, String type) {
        super(ID, title, type);

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
