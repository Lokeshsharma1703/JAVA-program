import java.util.Scanner;
public class ArrayDevideBy5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array : ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        int arr2[] = new int[n];
        int first = 0;
        int last = arr.length-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%5==0)
                arr2[last--] = arr[i];
            else
                arr2[first++] = arr[i];
        }
        System.out.print("Array : ");
        for(int i=0;i<n;i++)
            System.out.print(arr2[i]+" ");
    }
}