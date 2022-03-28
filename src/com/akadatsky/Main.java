package com.akadatsky;

public class Main {

    public static void main(String[] args) {
        Pegasus pegasus = new Pegasus();
        pegasus.move();

        Bird bird = new Bird();
        Horse horse = new Horse();
        Pegasus2 pegasus2 = new Pegasus2(bird, horse);
        pegasus2.move();

    }

}
