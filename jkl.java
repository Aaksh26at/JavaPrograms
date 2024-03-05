

interface Animal {
    void makeSound();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
	
    public void makeSound() {
        System.out.println("Woof!");
    }
    
    public void play() {
        System.out.println("The dog is playing fetch.");
    }
}

public class jkl {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); 
        dog.play();      
    }
}

