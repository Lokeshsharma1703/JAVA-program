public class Programming
{
    void Programming()
    {
        System.out.println("I love programming languages.");
    }
    void Programming(String x)
    {
        System.out.println("I love "+x);
    }

    public static void main(String[] args)
    {
        Programming obj = new Programming();
        obj.Programming("Java");
        obj.Programming();
        obj.Programming("Python");
    }
}
