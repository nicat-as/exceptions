package az.developia.exceptions;

import az.developia.exceptions.checked.FileProcessor;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            checkMail("nasd@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Your mail is wrong. Please write correct");
            throw new RuntimeException("", e);
        }

        var fileProcessor = new FileProcessor();
        String text;
        try {
            var is = fileProcessor.getFile("file.txt");
            text = fileProcessor.readStream(is);
        } catch (IOException e) {
            e.printStackTrace();
            text = "Io exception happpened";
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            text = "Unknown exception";
        }

        System.out.println(text);

    }

    public static void checkMail(String email) {
        var is = Pattern.compile("")
                .matcher(email)
                .find();
        System.out.println(is);
    }
}
