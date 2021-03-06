/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyApp3;

import MyApp3.commands.CommandFactory;
import MyApp3.commands.ICommand;
import MyApp3.console.IConsole;
import MyApp3.console.impl.Console;

import java.util.LinkedList;


public class App {
    public static void main(String[] args) {
        IConsole console = new Console();
        CommandFactory factory = new CommandFactory(console);
        LinkedList<ICommand> cmds = factory.returnsCommands();
        cli(cmds, console);
    }

    private static void cli(LinkedList<ICommand> cmds, IConsole console) {
        do {
            printCommandLineMenu(cmds);
            ICommand cmd = selectAnOption(cmds, console);
            cmd.execute();
        } while(true);
    }

    private static void printCommandLineMenu(LinkedList<ICommand> cmds) {
        System.out.println("Console-Application: Exercise-3               <Mohamed Neji> <Ghazouani> <579181>\n");
        for (int i = 1; i < cmds.size(); i++) {
            System.out.println(i + ". " + cmds.get(i));
        }
        System.out.println("0. " + cmds.get(0));
    }

    private static ICommand selectAnOption(LinkedList<ICommand> cmds, IConsole console) {
        do {
            int selectedOption = console.readInteger("Please enter a number for an option: ");
            if (isValidOption(selectedOption, 0, cmds.size())) {
                return cmds.get(selectedOption);
            }
        } while (true);
    }

    private static boolean isValidOption(int index, int min, int max) {
        return index >= min && index < max;
    }
}