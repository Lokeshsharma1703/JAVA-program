class check
{
    static int count = 0;
    {
        count+=1;
    }
    public check()
    {

    }
    public check(int n)
    {

    }
    public check(double f)
    {

    }
    public check(int a, double b)
    {

    }
    public check(String something)
    {

    }
}
public class count_object
{
    public static void main(String[] args)
    {
        check obj1 = new check();
        check obj2 = new check(5);
        check obj3 = new check(5, 3.6);
        check obj4 = new check(6.3);
        check obj5 = new check(34);
        check obj6 = new check("Hello");
        System.out.print("No. of instances created : "+check.count);
    }
}
