package Observer.Pseudocode;
import java.io.File;

public class LoggingListener implements  EventListeners{
    private File log;
    private String message;

    public LoggingListener(String log_filename, String message) {
        log = new File(log_filename);
        this.message = message;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed "
                + eventType + " operation with the following file: "
                + file.getName());

    }
}
