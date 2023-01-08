package Ex1.Bai1_6;

public class TestMain {
    public static void main(String[] args) {
        Cat cat = new Cat(" Cat beautiful");
        cat.greets();
        System.out.println();

        Dog dog = new Dog("Nicky");
        dog.greets();
        Dog anotherDog = new Dog(" Dead");
        anotherDog.greets();
        System.out.println("This is Dead say hi to Nicky:");
        anotherDog.greets(dog);
        System.out.println();

        BigDog bigDog = new BigDog("Trusty");
        bigDog.greets();
        System.out.println("This is Dead say hi to Trusty:");
        bigDog.greets(dog);
        System.out.println();

        BigDog anotherBigDog = new BigDog("Spike from the universe of Tom and Jerry");
        anotherBigDog.greets();
        System.out.println("This is Spike say hi to Trusty:");
        anotherBigDog.greets(bigDog);
    }
}
