package pckFunctionFactory.FunctionsUserInteractions;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class HelpFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Enter pn to try Prime Number function");
        console.writeln("Enter p to try Palindrome function");
        console.writeln("Enter a to try Armstrong function");
        console.writeln("Enter tp to try Table Print function");
        console.writeln("Enter fn to try Factorial function");
        console.writeln("Enter ff to try Fibnocci function");
        console.writeln("Enter p1 to try Pattern 1 function");
        console.writeln("Enter p2 to try Pattern 2 function");
        console.writeln("Enter p3 to try Pattern 3 function");
        console.writeln("Enter p4 to try Pattern 4 function");
        console.writeln("Enter p5 to try Pattern 5 function");
        console.writeln("Enter p6 to try Pattern 6 function");
        console.writeln("Enter p6 to try Pattern 6 function");
        console.writeln("Enter q to quit");
        console.writeln("===================================");

    }
}
