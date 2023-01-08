package AbstractFactory.Pseudocode;

public class ApplicationConfigurator {
    private static Application configurator() {
        Application application;
        GUIFactory factory;

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacFactory();
        } else {
            factory = new WinFactory();
        }
        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application application = ApplicationConfigurator.configurator();
        application.paint();

    }
}
