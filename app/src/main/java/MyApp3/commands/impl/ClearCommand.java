package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;

public class ClearCommand implements ICommand {

    private final IStackable<Student> stack;

    public ClearCommand(IStackable<Student> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        this.stack.clear();
    }
    @Override
    public String toString() {

        return "Clear stack.";

    }
}
