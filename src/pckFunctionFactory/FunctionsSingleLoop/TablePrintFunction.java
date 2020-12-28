package pckFunctionFactory.FunctionsSingleLoop;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class TablePrintFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Table print function");
        console.writeln("===================================");
        int number = console.readNumber("Enter number of rows:");
        for(int i=0; i<number; i++)
        {
            console.writeln(String.valueOf(i) + "   " + String.valueOf(i-1) + "    " + String.valueOf(i-2)+ "    " + String.valueOf(i-3));
        }
        console.writeln("===================================");
    }
}
