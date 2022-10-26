package pwo.lab09.builder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.exit;

public class TxtPicInteractiveApp {
    public static void main(String[] args) throws IOException {
        TxtPic3 builder = new TxtPic3();

        writeLine("size = ");
        builder.setSize(readInteger());
        writeLine("foreground = ");
        builder.setForeground(readChar());
        writeLine("background = ");
        builder.setBackground(readChar());
        writeLine("file name = ");
        builder.setFileName(readLine().trim());

        try {
            builder.createTxtPic();
        } catch (ValidationFailedException e) {
            error(e.getMessage());
        }

        builder.save();
    }

    private static void writeLine(String text) {
        System.out.println(text);
    }

    private static String readLine() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(
                System.in));
        return bufferedReader.readLine();
    }

    private static char readChar() throws IOException {
        String input = readLine();

        if (input.length() > 1) {
            error("Single char expected!");
        }

        return input.charAt(0);
    }

    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_RESET = "\u001B[0m";

    private static int readInteger() throws IOException {
        String input = readLine();

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            error("Invalid number!");
        }

        throw new UnsupportedOperationException();
    }

    private static void error(String message) {
        writeLine(TEXT_RED + message + TEXT_RESET);
        exit(1);
    }
}
