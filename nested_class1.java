class b1
{
    static int a=5;
    int b;
    private static int c=10;
    static class b2
    {
        void display()
        {
            System.out.println(a);
//            System.out.println(b);     it throws an error because b is not static varible
            System.out.println(c);
        }
    }
}
public class nested_class1
{
    public static void main(String[] args) {
        b1.b2 a = new b1.b2();
        a.display();
    }
}
