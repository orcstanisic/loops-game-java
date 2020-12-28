package pckFunctionFactory.FunctionsUserInteractions;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class UnknownFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("Function not recognized, enter 'h' for help.");
    }
}
