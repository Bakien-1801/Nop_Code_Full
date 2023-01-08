package Design_Patterns.Singleton.pseudocode;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM K64 WHERE FROM NAM DINH");
        Database bar = Database.getInstance();
        bar.query("SELECT * FROM K66A5");
        System.out.println(foo == bar);
    }
}
