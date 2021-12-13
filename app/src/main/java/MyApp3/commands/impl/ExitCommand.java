package MyApp3.commands.impl;

import MyApp3.commands.ICommand;

public class ExitCommand implements ICommand {

    @Override
    public void execute() {
        System.out.println("Exit program.");
        System.exit(0);
    }

    @Override
    public String toString() {
        return "Exit program";
    }


}

