import java.util.Scanner;
public class GenericMethod
{
    public <E> void printarray(E s[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(s[0]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        GenericMethod g=new GenericMethod();
        String str[]=new String[1];
        Integer i[]=new Integer[1];
        Character c[]=new Character[1];
        System.out.print("Enter a string : ");
        str[0] = sc.next();
        System.out.print("Enter a integer : ");
        i[0] = sc.nextInt();
        System.out.print("Enter a character : ");
        c[0] = sc.next().charAt(0);
        g.printarray(str);
        g.printarray(i);
        g.printarray(c);
    }
}