package pckApp;

import pckConsoleClient.ConsoleClient;
import pckConsoleClient.IUserInterface;
import pckFunctionFactory.FunctionFactory;
import pckFunctionFactory.IFunction;
import pckFunctionFactory.IFunctionFactory;

public class App implements IApp
{
    public  void start()
    {
        IUserInterface userInterface = new ConsoleClient();
        IFunctionFactory ffactory = new FunctionFactory();
        IFunction function = ffactory.createFunction("g");
        function.run(userInterface);
        String message = "Enter: pn/p/a/tp/fn/ff/p1/p2/p3/p4/p5/p6 or 'h' for Help ";
        String input = userInterface.read(message);
        while(!input.equals("q"))
        {
            function = ffactory.createFunction(input);
            function.run(userInterface);
            input = userInterface.read(message);
        }
        function = ffactory.createFunction("q");
        function.run(userInterface);
    }
}
