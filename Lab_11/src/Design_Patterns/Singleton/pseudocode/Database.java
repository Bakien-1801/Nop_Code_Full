package Design_Patterns.Singleton.pseudocode;

public class Database {
    private static Database instance;

    private Database() {

    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("thuc thi cua lenh: " + sql);
    }
}
