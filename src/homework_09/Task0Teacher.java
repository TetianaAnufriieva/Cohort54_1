package homework_09;

public class Task0Teacher {
    public static void main(String[] args) {
        String hello = "Hello";

        printStringLength(hello);
        printStringLength("Hello World!");
    } // End main

    public static void printStringLength(String string) {
        System.out.println(string.length());
    }

} // End class