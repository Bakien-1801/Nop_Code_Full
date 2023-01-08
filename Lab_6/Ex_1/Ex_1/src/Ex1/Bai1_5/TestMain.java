package Ex1.Bai1_5;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("test animal:");
        Animal animal = new Animal("jerry the mouse");
        System.out.println(animal);
        System.out.println();

        // test mammal
        System.out.println("test mammal:");
        Mammal mammal = new Mammal("still jerry but mammal");
        System.out.println(mammal);
        System.out.println();

        // test cat
        System.out.println("test cat:");
        Cat cat = new Cat("tom the cat");
        System.out.println(cat);
        cat.greets();
        System.out.println();

        // test dog
        System.out.println("test dog:");
        Dog dog = new Dog("spike the bulldog");
        System.out.println(dog);
        dog.greets();
        Dog anotherDog = new Dog("goofy from Walt Disney");
        System.out.println(anotherDog);
        anotherDog.greets();
        System.out.println("this is goofy say hi to spike:");
        anotherDog.greets(dog);
    }
}
