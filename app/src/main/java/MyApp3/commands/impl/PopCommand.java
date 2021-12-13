package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.console.IConsole;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;

public class PopCommand implements ICommand {
    private final IStackable<Student> stack;

    public PopCommand(IStackable<Student> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        this.stack.pop();
        System.out.println("A student got deleted");

    }
    @Override
    public String toString() {

        return "Pop student from stack.";

    }
}