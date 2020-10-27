package facebook.datamodel;

public class Profile {
    String fullName;
    String emailAddress;
    Location location;
    Message messages;
    Picture picture;

    public Profile(){}
    public Profile(String fullName, String emailAddress, Location location, Message messages, Picture picture) {
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.location = location;
        this.messages = messages;
        this.picture = picture;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Message getMessages() {
        return messages;
    }

    public void setMessages(Message messages) {
        this.messages = messages;
    }

    public Picture getPicture() {
        return picture;
    }

    public void setPicture(Picture picture) {
        this.picture = picture;
    }
}
