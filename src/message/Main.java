package message;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        var messages = new Message[3];
        messages[0] = new Message(new User("nicat"), "Hello, how are you");
        messages[1] = new Message(new User("hugh"), "Hello, how are you");
        messages[2] = new Message(new User("jack"), "Hello, how are you");

        Arrays.stream(messages).forEach(System.out::println);

    }
}
