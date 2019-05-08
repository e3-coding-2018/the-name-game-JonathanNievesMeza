package com.e3civichigh.coding.thenamegame;

public class TheNameGame {
    public static void main(String[] args) {
        String name = "Jonathan";
//        Jonathan, Jonathan, bo-bonathan
//        Banana-fana fo-fonathan
//        Fee-fi-mo-monathan
//        Jonathan!

        TheNameGame game = new TheNameGame();
        String song = game.createSong(name);
        System.out.println(song);
    }

    @SuppressWarnings("WeakerAccess")
    public String createSong(String name) {

        String sep = ", ";
        String x = name;
        String y = name.substring(1);
        String b = "b";
        String m = "m";
        String f = "f";

        char letter = name.toLowerCase().charAt(0);
        if ("aeiou".indexOf(letter) > -1) {
            y = name.toLowerCase();
        } else if (letter == 'm') {
            m = "";
        } else if (letter == 'f') {
            f = "";
        } else if (letter == 'b') {
            b = "";
        }

        String song = x + sep + x + sep + "bo-" +b + y + "\n";
        song = song + "Banana-fana fo-"+f + y + "\n";
        song = song + "Fee-fi-mo-" +m + y  + "\n";
        song = song + name + "!\n";
        return song;
    }
}
