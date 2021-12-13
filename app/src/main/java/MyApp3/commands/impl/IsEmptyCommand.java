package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;

public class IsEmptyCommand implements ICommand {

    private final IStackable<Student> stack;

    public IsEmptyCommand(IStackable<Student> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        System.out.println(this.stack.isEmpty() ? "The stack is empty" : "The stack is not empty");
    }
    @Override
    public String toString() {

        return "Is stack empty.";

    }
}