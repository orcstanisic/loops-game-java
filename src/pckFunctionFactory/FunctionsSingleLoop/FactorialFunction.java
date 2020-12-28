package pckFunctionFactory.FunctionsSingleLoop;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class FactorialFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Factorial function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number");
        int factorial = 1;
        for(int i=1; i<=number; i++)
        {
            factorial = factorial * i;
        }

        console.writeln("Factorial of " + number +" is " + factorial);
        console.writeln("===================================");
    }
}
