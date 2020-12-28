package pckFunctionFactory.FunctionsUserInteractions;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class QuitFunction implements IFunction
{
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Sorry to see you going away. :(");
        console.writeln("Thanks for playing.");
        console.writeln("See you soon ...");
        console.writeln("===================================");
    }
}
