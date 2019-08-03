/**
 * Animal.java          -A program to demonstrate an abstract class.
 * @author               Ratna Lama
 * @version              1.0
 * @since                07/25/2019
 *
 * @description:
 * Abstract class - cannot create instances of an Abstract class.
 * Abstract class are used as a parent class for inheritance. The child must implement abstract method(s).
 */
package dev.ratnalama;

public abstract class Animal {
    int age;
    String gender;
    int weightInLbs;

    public Animal(int age, String gender, int weightInLbs) {
        this.age = age;
        this.gender = gender;
        this.weightInLbs = weightInLbs;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void sleep() {
        System.out.println("Sleeping...");
    }

    /**
     * Abstraction of animal movement
     * Child classes must implement this method
     */
    public abstract void move();
}
