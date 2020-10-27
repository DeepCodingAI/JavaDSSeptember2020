package facebook.datamodel;

public class Message {
    String messageId;
    String messageResponses;

    public Message(){}
    public Message(String messageId, String messageResponses) {
        this.messageId = messageId;
        this.messageResponses = messageResponses;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageResponses() {
        return messageResponses;
    }

    public void setMessageResponses(String messageResponses) {
        this.messageResponses = messageResponses;
    }

}
