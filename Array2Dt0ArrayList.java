import java.util.*;
public class Array2Dt0ArrayList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 2D array N * M : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                arr[i][j] = sc.nextInt();
        }
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]%2==0)
                    even.add(arr[i][j]);
                else
                    odd.add(arr[i][j]);
            }
        }
        System.out.println("Even arraylist : "+even);
        System.out.println("Odd arraylist : "+odd);
    }
}