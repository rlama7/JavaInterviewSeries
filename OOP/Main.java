/**
 * Main.java            -A program to demonstrate an abstract class.
 * @author               Ratna Lama
 * @version              1.0
 * @since                07/25/2019
 *
 * @description:
 * The main driver program to demonstrate best practices of Object Oriented Programming OOP namely:
 * Inheritance,
 * Interface,
 * Abstract Class
 * Polymorphism
 * Encapsulation
 */
package dev.ratnalama;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n---------------------------Human Class--------------------------------------------------");
        Human ray = new Human("Ray", 21, 75, "black");
        ray.speak();

        System.out.println("-----------------------------Animal Class-------------------------------------------------");
        System.out.println("Animal class is an abstract class and cannot be instantiated\n");
//        Animal llama = new Animal(12, "M", 23);
//        llama.eat();
//        llama.sleep();
        System.out.println("Polymorphism example: ");
        Animal greenSparrow = new Sparrow(1 ,"M", 4);
        Animal shark = new Fish(3, "M", 50);

        moveAnimal(greenSparrow);
        moveAnimal(shark);

        System.out.println("-----------------------------Bird Class---------------------------------------------------");
        Bird parrot = new Bird(3, "F", 10);
        parrot.move();

        System.out.println("Polymorphism example: ");
        // Sparrow implement flyable interface so its ok to instantiate
        Flyable blackSparrow = new Sparrow(2, "3", 5);
        blackSparrow.fly();
//        Flyable eagle = new Bird(4, "F", 7);  cannot instantiate because Bird doesn't implement Flyable interface

        System.out.println("-----------------------------Fish Class---------------------------------------------------");
        Fish nemo = new Fish(1, "F", 5);
        nemo.move();

        System.out.println("-----------------------------Chicken Class------------------------------------------------");
        Chicken littleChicken = new Chicken(2, "F", 6);
        littleChicken.move();
        littleChicken.fly();

        System.out.println("-----------------------------Sparrow Class------------------------------------------------");
        Sparrow redSparrow = new Sparrow(5, "F", 10);
        redSparrow.eat();
        redSparrow.fly();

        System.out.println("-----------------------------Fish Class---------------------------------------------------");

        System.out.println("-----------------------------Fish Class---------------------------------------------------");


        System.out.println("\n----------------------------------------------------------------------------------------");
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
