import java.util.Scanner;
public class Recursive_sumArray
{
    public static int sum(int arr[],int currentPos)
    {
        int sum=0;
        if(currentPos==arr.length-1)
            return arr[currentPos];
        return sum=sum+arr[currentPos]+sum(arr,currentPos+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.println("Sum : "+sum(arr,0));
    }
}