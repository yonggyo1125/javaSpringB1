package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Human human = new Human(); // Human, Animal
        human.move();

        Dog dog = new Dog(); // Dog, Animal
        dog.move();

        Bird bird = new Bird(); // Bird, Animal
        bird.move();
    }
}
