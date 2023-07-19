package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human(); // Human, Animal
        human.move();

        Animal tiger = new Tiger(); // Tiger, Animal
        tiger.move();

        Animal dog = new Dog(); // Dog, Animal
        dog.move();
    }
}
