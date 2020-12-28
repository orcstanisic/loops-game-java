package pckFunctionFactory.FunctionsSingleLoop;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class ArmstrongNumberFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Armstrong function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number");
        String isit = "";
        int tmpNumber = number;
        int digit;
        int armstrong =0;
        while(tmpNumber != 0)
        {
            digit = tmpNumber%10;
            armstrong = armstrong + digit*digit*digit;
            tmpNumber = tmpNumber/10;
        }
        if(number!=armstrong)
        {
            isit="NOT ";
        }
        console.writeln("Number is " + isit +"Armstrong number");
        console.writeln("===================================");
    }
}
