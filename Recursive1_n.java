import java.util.Scanner;
public class Recursive1_n
{
    public void print(int n)
    {
        if(n==0)
            return;
        print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Recursive1_n obj = new Recursive1_n();
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        obj.print(n);
    }
}