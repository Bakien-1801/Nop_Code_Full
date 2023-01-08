package Observer.Pseudocode;

import java.io.File;

public class EmailAlertsListener implements EventListeners {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed "
                + eventType + " operation with the following file: "
                + file.getName());

    }
}
