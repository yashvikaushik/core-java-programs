package inheritance;

public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println();
        Dog dog=new Dog("sheero",2,"shitzu");
        dog.makeSound();
        dog.display();
        System.out.println();

        Cat cat=new Cat("baadal",4,"persian blue");
        cat.makeSound();
        cat.display();

    }
    
}
