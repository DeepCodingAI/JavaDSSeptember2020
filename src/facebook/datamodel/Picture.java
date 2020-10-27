package facebook.datamodel;

public class Picture {

    String image;
    String postDate;

    public Picture(){}
    public Picture(String image, String postDate) {
        this.image = image;
        this.postDate = postDate;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

}
