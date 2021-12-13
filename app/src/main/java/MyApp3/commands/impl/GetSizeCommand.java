package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;

public class GetSizeCommand implements ICommand {
    private final IStackable<Student> stack;

    public GetSizeCommand (IStackable<Student> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        System.out.println("Size of Stack: " + this.stack.size());
    }
    @Override
    public String toString() {

        return "Returns size of stack.";

    }
}