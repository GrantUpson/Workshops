package upson.grant;

public class Launcher
{
    public static void main(String[] args)
    {
        if(args.length != 1) {
            System.out.println("Invalid number of arguments. Terminating.");
        } else {
            FrequencyCounter counter = new FrequencyCounter();
            counter.generateFrequency(args[0]);
        }
    }
}
