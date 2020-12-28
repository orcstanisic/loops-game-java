package pckFunctionFactory.FunctionsSingleLoop;

import pckConsoleClient.IUserInterface;
import pckFunctionFactory.IFunction;

public class PalindromeFunction implements IFunction
{
    @Override
    public void run(IUserInterface console)
    {
        console.writeln("===================================");
        console.writeln("Welcome to Palindrome function");
        console.writeln("===================================");
        String input = console.read("Enter number or string:");
        char[] chars = input.toCharArray();
        String isit = "";
        for(int i=0; i<chars.length/2; i++)
        {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isit = "NOT ";
                break;
            }
        }
        console.writeln("Input is " + isit +"palindrome.");
        console.writeln("===================================");
    }
}
