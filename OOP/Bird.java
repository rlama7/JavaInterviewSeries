/**
 * Bird.java        -A program to demonstrate inheritance
 * @author          Ratna Lama
 * @version         1.0
 * @since           07/25/2019
 *
 * @description:
 */
package dev.ratnalama;

public class Bird extends Animal {

    public Bird(int age, String gender, int weightInLbs) {
        super(age, gender, weightInLbs);
    }

    @Override
    public void move() {
        System.out.println("Birds move flapping its wings...");
    }

}
