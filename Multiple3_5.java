import java.util.Scanner;
public class Multiple3_5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Elements that are multiple of 3 or 5 : ");
        for(int i=0;i<n;i++)
        {
            if(arr[i]%3==0 && arr[i]%5==0)
            {}
            else if(arr[i]%3==0 || arr[i]%5==0)
                System.out.print(arr[i]+" ");
        }
    }
}
