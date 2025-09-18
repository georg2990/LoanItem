public class Video extends loanItem {
    public Video(int ID, String title, String type) {
        super(ID, title, type);

    }

    @Override
    public String getType() {
        return "Video";
    }

}