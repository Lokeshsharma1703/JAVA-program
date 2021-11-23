class Emp
{
    int Eid;
    String name;
    public Emp()
    {
        System.out.println("In Emp...");
    }
}
class perEmp extends Emp
{
    int basic_pay;
    public perEmp()
    {
        System.out.println("In PerEmp...");
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        System.out.println("Object of Emp class..");
        Emp obj = new Emp();
        System.out.println("------------------------------------------");
        System.out.println("object of perEmp class..");
        perEmp obj2 = new perEmp();
    }
}
