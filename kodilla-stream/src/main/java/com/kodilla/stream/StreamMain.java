package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

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

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }


}
