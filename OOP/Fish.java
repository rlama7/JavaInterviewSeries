package dev.ratnalama;

public class Fish extends Animal {
    public Fish(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Fish moves using its fins and a tail...");
    }

}
