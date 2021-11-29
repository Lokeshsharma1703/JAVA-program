class b3
{
    static int a=5;
    int b=10;
    public static int c=15;
    class b4
    {
        void display()
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }
    }
}
public class nested_class2
{
    public static void main(String[] args) {
        b3 a = new b3();
        b3.b4 b = a.new b4();
        b.display();
    }
}
