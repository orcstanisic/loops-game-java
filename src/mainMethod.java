import pckApp.IApp;
import pckApp.App;

public class mainMethod
{
    public static void main(String[] args) {
        IApp app = new App();
        app.start();
    }
}
