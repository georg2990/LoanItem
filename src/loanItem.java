//super class
public class loanItem {
    String title;
    String type;
    int ID;

    // Constructor
    public loanItem(int ID, String type, String title) {
        this.ID = ID;
        this.title = title;
        this.type = type;
    }

    // getter for titel
    public String getTitle() {
        return title;
    }
    // getter for type
    public String getType() {
        return type;
    }
    // toString til at udskrive objekt
    public String  toString() {
        return (title + " " + type);
    }
}


