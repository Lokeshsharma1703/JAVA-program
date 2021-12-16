public class Initialization_block
{
    {
        System.out.println("In initialization block...");
    }
    public Initialization_block()
    {
        System.out.println("In constructor...");
    }

    public static void main(String[] args)
    {
        Initialization_block obj = new Initialization_block();
    }
}
