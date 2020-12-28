package pckConsoleClient;

import java.util.Scanner;


public class ConsoleClient implements IUserInterface
{
    public String read(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.next();
    }

    public int readNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }

    public void writeln(String message)
    {
        System.out.println(message);
    }
    public void write(String message)
    {
        System.out.print(message);
    }
}
