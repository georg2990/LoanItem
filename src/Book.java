public class Book extends loanItem {
    public Book(String name) {
        super(name);

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
