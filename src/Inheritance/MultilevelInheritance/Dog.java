package Inheritance.MultilevelInheritance;

public class Dog extends Animal {
    void bark() {
        System.out.println("Child Class: Dog bark");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Child Class: Dog eat");
    }

    @Override
    void sleep() {
        super.sleep();
        System.out.println("Child Class: Dog sleep");
    }

    @Override
    void move() {
        super.move();
        System.out.println("Child Class: Dog move");
    }
}
