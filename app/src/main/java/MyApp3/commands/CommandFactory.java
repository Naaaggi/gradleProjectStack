package MyApp3.commands;

import MyApp3.commands.impl.*;
import MyApp3.console.IConsole;
import MyApp3.data.Student;
import MyApp3.stack.IStackable;
import MyApp3.stack.Stack;

import java.util.LinkedList;

public class CommandFactory {

    final private IConsole console;
    IStackable<Student> stack = new Stack();

    public CommandFactory(IConsole console) {
        super();
        this.console = console;
    }

    public LinkedList<ICommand> returnsCommands() {
        LinkedList<ICommand> cmds = new LinkedList<ICommand>();
        cmds.add(new ExitCommand());
        cmds.add(new PushCommand(console, stack));
        cmds.add(new PopCommand(stack));
        cmds.add(new PeekCommand(stack));
        cmds.add(new IsEmptyCommand(stack));
        cmds.add(new ClearCommand(stack));
        cmds.add(new PrintCommand(stack));
        cmds.add(new GetSizeCommand(stack));

        return cmds;
    }
}
