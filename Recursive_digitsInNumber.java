import java.util.Scanner;
public class Recursive_digitsInNumber
{
    public static int digitsInNumber(int n)
    {
        int count=0;
        if(n==0)
            return count++;
        return count=count+1+digitsInNumber(n=n/10);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print(digitsInNumber(n));
    }
}