public class Video extends loanItem {
    public Video(String title, String type) {
        super(title, type);

    }

    @Override
    public String getType() {
        return "Video";
    }

    @Override
    public String getName() {
        return "Title";
    }

    @Override
    public String toString(){
        return "Video" + "Title";
    }
}