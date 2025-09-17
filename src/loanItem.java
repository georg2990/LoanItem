//super class
public class loanItem {
    String title;
    String type;

    // Constructor
    public loanItem(String title, String type) {
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


