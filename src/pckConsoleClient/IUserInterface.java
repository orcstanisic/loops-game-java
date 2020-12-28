package pckConsoleClient;

interface IUserInterfaceRead
{
    String read(String message);
    int readNumber(String message);
}

interface IUserInterfaceWrite
{
    void writeln(String message);
    void write(String message);
}

public interface IUserInterface extends IUserInterfaceRead, IUserInterfaceWrite {

}
