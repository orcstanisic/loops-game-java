package pckFunctionFactory.FunctionsUserInteractions;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class GreatingsFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to my function game :)");
        console.writeln("===================================");
    }
}
