package pckFunctionFactory.FunctionsSingleLoop;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class PrimeNumberFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Prime Number function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number");
        String isit = "";
        for(int i=2; i<number; i++)
        {
            if (number % i == 0) {
                isit = "NOT ";
                break;
            }
        }
        console.writeln("Number is " + isit +"prime number");
        console.writeln("===================================");
     }
}
