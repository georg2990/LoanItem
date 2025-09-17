//super class
public class loanItem {
    String title;
    String type;
    int ID;

    // Constructor
    public loanItem(int ID, String type, String title) {
        this.title = title;
        this.type = type;
    }

    public String getName() {
        return title;
    }
    public String getType() {
        return type;
    }

    public String  toString() {
        return (title + " " + type);
    }



}


