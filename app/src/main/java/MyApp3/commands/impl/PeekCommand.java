package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;

public class PeekCommand implements ICommand {
    private final IStackable<Student> stack;

    public PeekCommand(IStackable<Student> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        Student studentToPrint = stack.peek();
        System.out.println(studentToPrint);
    }
    @Override
    public String toString() {

        return "Peek student.";

    }
}