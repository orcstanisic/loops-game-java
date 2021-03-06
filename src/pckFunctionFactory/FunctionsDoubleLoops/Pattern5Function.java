package pckFunctionFactory.FunctionsDoubleLoops;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class Pattern5Function implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Pattern 5 function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number of rows:");
        for(int i=0; i<number; i++)
        {
            for(int j=0; j<number-i; j++)
            {
                console.write(" ");
            }

            for(int j=0; j<=i; j++)
            {
                console.write("*");
            }
            console.writeln("");
        }
        console.writeln("===================================");
    }
}
