import java.util.ArrayList;

public abstract class Friend {
    public String surname;
    ArrayList<Post>listPost = new ArrayList<Post>();

    public Friend(String surname) {
        this.surname = surname;
    }
    public abstract   double  profilScore();
    public boolean addPost(Post post){
        return false;
    }
    public int shareNumber(){
        return 0;
    }
    public int postNumber(){
        return 0;
    }
    public int post_textNumber(){
        return 0;
    }
    public int post_imageNumber(){
        return 0;
    }
    public String userType(){
        return null;
    }
    public int friendNumber() {
        return 0;
    }

}
