package command.example;

import command.example.Command;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<Command> history = new ArrayList<>();

    public void storeAndExecute(Command c){
        history.add(c);
        c.execute();

    }
}
