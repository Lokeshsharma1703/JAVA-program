public class Exception_sum
{
    public static void main(String[] args)
    {
        int sum = 0;
        for(String i:args)
        {
            try
            {
                sum+=Integer.parseInt(i);
            }
            catch(NumberFormatException a)
            {
                System.out.println(i+" is not an Integer.");
            }
        }
        System.out.println("Sum is : "+sum);
    }
}
