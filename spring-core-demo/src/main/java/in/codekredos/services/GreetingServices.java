package in.codekredos.services;

public class GreetingServices {

    private final String message;
    public GreetingServices(String message)
    {
        this.message = message;
    }

    public String getGreeting()
    {
        return "Hello from " + " message" + " !";
    }
}