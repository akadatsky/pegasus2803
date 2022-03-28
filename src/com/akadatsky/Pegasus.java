package com.akadatsky;

// Composition
// композиция
public class Pegasus extends Animal {

    private Bird bird = new Bird();
    private Horse horse = new Horse();

    @Override
    public void move() {
        horse.move();
        bird.move();
    }

    public void sing() {
        bird.sing();
    }

    public void makeIgogo() {
        horse.makeIgogo();
    }

}
