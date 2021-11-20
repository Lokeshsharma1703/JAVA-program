class abc
{
    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a, double b)
    {
        return a+b;
    }
    public double sum(int a, double b)
    {
        return a+b;
    }
    public double sum(double a, int b)
    {
        return a+b;
    }
}
public class method_overloading
{
    public static void main(String[] args)
    {
        abc obj = new abc();
        System.out.println(obj.sum(5,6));
        System.out.println(obj.sum(5,6.0));
        System.out.println(obj.sum(5.2,6));
        System.out.println(obj.sum(5.2,6.3));
    }
}
