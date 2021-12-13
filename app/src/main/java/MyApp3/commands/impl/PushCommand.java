package MyApp3.commands.impl;

import MyApp3.commands.ICommand;
import MyApp3.console.IConsole;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;


public class PushCommand implements ICommand {

    final private IConsole console;
    private final IStackable<Student> stack;

    public PushCommand(IConsole console, IStackable<Student> stack) {
        this.console = console;
        this.stack = stack;
    }

    @Override
    public void execute() {
        String prename = console.readString("Please enter the prename: ");
        String surname = console.readString("Please enter the surname: ");
        int matriculationNumber = console.readInteger("Please enter the matriculation number: ");
        int course = console.readInteger("Please enter the course number: ");
        Student student = new Student(prename, surname, matriculationNumber, course);
        stack.push(student);
        System.out.println("The student "+ student.getPrename() +" has been pushed.");
    }
    @Override
    public String toString() {

        return "Push student to stack.";

    }
}