package pckFunctionFactory.FunctionsSingleLoop;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class FibnocciFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Fibnocci function");
        console.writeln("===================================");
        int penultimate = 0;
        int ultimate = 1;
        int tmp;
        console.writeln("Fibnocci series is :");
        console.writeln(String.valueOf(penultimate));
        for(int i=1; i<12; i++)
        {
            console.writeln(String.valueOf(ultimate));
            tmp= penultimate+ultimate;
            penultimate = ultimate;
            ultimate = tmp;
        }
        console.writeln("===================================");
     }
}
