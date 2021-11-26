package az.developia.exceptions;

import az.developia.exceptions.custom.User;

public class CustomExceptionMain {
    public static void main(String[] args) {
        // this will succeed
//        var u1 = new User("Hugh", "Jackson", "some@sm.com");
//        System.out.println(u1);
//        var u2 = new User("Lei","Hanks","wrongEmail");
//        System.out.println(u2);
        var q = -2;
        try {
            assert q >0 : "Just tries";
        } catch (Throwable t){
            System.out.println("Catching error class");
        }
    }
}
