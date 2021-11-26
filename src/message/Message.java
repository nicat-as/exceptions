package message;

public class Message {
    private User sender;
    private String body;

    public Message(User sender, String body) {
        this.sender = sender;
        this.body = body;
    }

    public String printMessage() {
        return String.format("%s: %s", this.sender.getName(), this.body);
    }

    @Override
    public String toString() {
        return printMessage();
    }
}
