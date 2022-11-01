import java.util.GregorianCalendar;

public class Post {
    protected boolean like;
    protected boolean share;
    protected GregorianCalendar date;
    protected PostType postType;

    public Post(boolean like, boolean share, GregorianCalendar date, PostType postType) {
        this.like = like;
        this.share = share;
        this.date = date;
        this.postType = postType;
    }

    public boolean liked() {
        return like = true;
    }

    public boolean unliked() {
        return like = false;
    }

    public boolean share() {
        return share = true;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Post{" +
                "like=" + like +
                ", share=" + share +
                ", date=" + date +
                ", postType=" + postType +
                '}';
    }
}

