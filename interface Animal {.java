interface Animal {
    void eat();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("The dog eats food.");
    }
}

public class InterfaceAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
