class rectangle
{
    private double l;
    private double b;
    public rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }
    public double area()
    {
        return l*b;
    }
    public double difference(rectangle r)
    {
        return(this.area()-r.area());
    }
}
public class ABC
{
    public static void main(String[] args)
    {
        rectangle x = new rectangle(16.3,9.5);
        rectangle y = new rectangle(10.2, 12.6);
        System.out.println(x.difference(y));
    }
}
