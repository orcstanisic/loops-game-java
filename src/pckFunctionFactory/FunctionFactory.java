package pckFunctionFactory;


import pckFunctionFactory.FunctionsDoubleLoops.*;
import pckFunctionFactory.FunctionsSingleLoop.*;
import pckFunctionFactory.FunctionsUserInteractions.GreatingsFunction;
import pckFunctionFactory.FunctionsUserInteractions.HelpFunction;
import pckFunctionFactory.FunctionsUserInteractions.QuitFunction;
import pckFunctionFactory.FunctionsUserInteractions.UnknownFunction;

public class FunctionFactory implements IFunctionFactory
{
    public IFunction createFunction(String func)
    {
        switch (func.toLowerCase())
        {
            case "pn" :
                return new PrimeNumberFunction();
            case "p" :
                return new PalindromeFunction();
            case "a" :
                return new ArmstrongNumberFunction();
            case "tp" :
                return new TablePrintFunction();
            case "fn" :
                return new FactorialFunction();
            case "ff" :
                return new FibnocciFunction();
            case "p1" :
                return new Pattern1Function();
            case "p2" :
                return new Pattern2Function();
            case "p3" :
                return new Pattern3Function();
            case "p4" :
                return new Pattern4Function();
            case "p5" :
                return new Pattern5Function();
            case "p6" :
                return new Pattern6Function();
            case "g" :
                return new GreatingsFunction();
            case "h" :
                return new HelpFunction();
            case "q" :
                return new QuitFunction();
            default:
                return new UnknownFunction();
        }
    }
}
