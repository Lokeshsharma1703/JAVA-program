abstract class a1
{
    abstract void second();
    public void first()
    {
        System.out.println("Hello");
    }
}
abstract class a2 extends a1
{
    abstract void third();
    void second()
    {
        System.out.println("Lokesh");
    }
}
class a3 extends a2
{
    void third()
    {
        System.out.println("Sharma");
    }
}
public class abstract_method
{
    public static void main(String[] args) {
        a3 a = new a3();
        a.first();
        a.second();
        a.third();
    }
}
