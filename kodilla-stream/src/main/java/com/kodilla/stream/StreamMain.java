package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Kodilla", (text) -> "|||" + text + "|||");
        poemBeautifier.beautify("Kodilla", (text) -> "ABC " + text + " CBA");
        poemBeautifier.beautify("Kodilla", (text) -> "##" + text.toUpperCase() + "##");
        poemBeautifier.beautify("Kodilla", (text) -> {
                                                            String result = "";
                                                            for (int i=0; i<text.length(); i++) {
                                                                 result = result + text.charAt(i) + "   ";
                                                            }
                                                            return "| || |||   " + result + "||| || |";
                                                            });

    }
}
