package pckFunctionFactory.FunctionsDoubleLoops;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class Pattern3Function implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Pattern 3 function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number of rows:");
        for(int i=0; i<number; i++)
        {
            for(int j=0; j<i; j++)
            {
                console.write(String.valueOf(j+1));
            }
            console.writeln("");
        }
        console.writeln("===================================");
       }
}
