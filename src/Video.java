// underklasse for video der arver fra loanItem
public class Video extends loanItem {

    // constructor der kalder fra superklassen constructor
    public Video(int ID, String title, String type) {
        super(ID, title, type);

    }

    @Override
    public String getType() {
        return "Video";
    }

}