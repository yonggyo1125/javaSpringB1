package exam04;

public class Ex01 {
    public static void main(String[] args) {
        Animal human = new Human(); // Human, Animal
        human.move();

        Animal dog = new Dog(); // Dog, Animal
        dog.move();

        Animal bird = new Bird(); // Bird, Animal
        bird.move();
    }
}
