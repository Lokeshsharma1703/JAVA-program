import java.util.Scanner;
public class Count_elementInOther
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array : ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.print("Enter first array : ");
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the size of second array : ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        System.out.print("Enter second array : ");
        for(int i=0;i<m;i++)
            arr2[i] = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int count = 0;
            for(int j=0;j<m;j++)
            {
                if(arr1[i]<=arr2[j])
                    count++;
            }
            System.out.print(count+", ");
        }
    }
}
