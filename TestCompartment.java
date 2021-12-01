import java.lang.Math;
abstract class Compartment
{
    public abstract String notice();
}
class FirstClass extends Compartment
{
    public String notice()
    {
        return "This is First class.";
    }
}
class Ladies extends Compartment
{
    public String notice()
    {
        return "This is Ladies coach.";
    }
}
class General extends Compartment
{
    public String notice()
    {
        return "This is general compartment.";
    }
}
class Luggage extends Compartment
{
    public String notice()
    {
        return "This is Luggage compartment.";
    }
}
public class TestCompartment
{
    public static void main(String[] args) {
        Compartment arr[] = new Compartment[10];
        double i = Math.random()*5;
        int x = (int)i;
        System.out.println(x);
        switch(x)
        {
            case (1):
            {
                arr[0] = new FirstClass();
                System.out.println(arr[0].notice());
                break;
            }
            case(2):
            {
                arr[1] = new Ladies();
                System.out.println(arr[1].notice());
                break;
            }
            case(3):
            {
                arr[2] = new General();
                System.out.println(arr[2].notice());
                break;
            }
            case(4):
            {
                arr[3] = new Luggage();
                System.out.println(arr[3].notice());
                break;
            }
        }
    }
}
