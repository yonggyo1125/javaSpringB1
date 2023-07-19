package exam02;

import exam01.A;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Human();  // Animal animal[0] = new Human()
        animals[1] = new Tiger(); // Animal animal[1] = new Tiger();
        animals[2] = new Dog();

        for (Animal animal : animals) {
            animal.move();

            if (animal instanceof Human) {
                Human human = (Human) animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger) animal;
                tiger.hunting();
            }
        }
    }
}
