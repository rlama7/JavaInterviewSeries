package dev.ratnalama;

public class Sparrow extends Bird implements Flyable {
    public Sparrow(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow Flying High...");
    }
}
