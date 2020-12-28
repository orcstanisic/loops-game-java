package pckFunctionFactory.FunctionsDoubleLoops;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class Pattern4Function implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Pattern 4 function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number of rows:");
        int tmp=0;
        for(int i=0; i<number; i++)
        {
            for(int j=0; j<=i; j++)
            {
                console.write(++tmp + " ");
            }
            console.writeln("");
        }
        console.writeln("===================================");
    }
}
