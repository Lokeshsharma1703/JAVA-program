interface xyz
{
    int a=5;
//    void sum();
    public default void sum()
    {
        System.out.println("Hello");
    }
}
interface x
{
    int c=10;
    void det();
}
class a4 implements xyz,x
{
    int x;
//    public void sum()
//    {
//        System.out.println("Hello");
//    }
    public void det()
    {
        System.out.println("World");
    }
}
public class interface_
{
    public static void main(String[] args) {
        a4 obj = new a4();
        System.out.println(obj.c);
        obj.sum();
        obj.det();
    }
}
