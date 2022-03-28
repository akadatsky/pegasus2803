package com.akadatsky;

// Aggregation
// аггрегация
public class Pegasus2 extends Animal {

    private final Bird bird;
    private final Horse horse;

    public Pegasus2(Bird bird, Horse horse) {
        this.bird = bird;
        this.horse = horse;
    }

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
