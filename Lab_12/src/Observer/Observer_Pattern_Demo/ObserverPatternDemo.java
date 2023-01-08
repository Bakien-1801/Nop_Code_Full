package Observer.Observer_Pattern_Demo;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        BinaryObserver binaryObserver = new BinaryObserver(subject);

        System.out.println("First state change: 18");
        subject.setState(18);
        System.out.println("=======================");
        subject.remove(binaryObserver);
        System.out.println("Second state change: 20");
        subject.setState(20);
    }

}
