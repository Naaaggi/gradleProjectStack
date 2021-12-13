package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;

public class PrintCommand implements ICommand {
    private final IStackable<Student> stack;

    public PrintCommand(IStackable<Student> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        this.stack.print();

    }
    @Override
    public String toString() {

        return "Print all students from stack.";

    }
}