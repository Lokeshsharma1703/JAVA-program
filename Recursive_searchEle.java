import java.util.Scanner;
public class Recursive_searchEle
{
    public static int find(int arr[],int currentindex, int search_value)
    {
        if(currentindex<arr.length)
        {
            if(arr[currentindex]==search_value)
            {
                return currentindex;
            }
        }
        return currentindex=find(arr,currentindex+1,search_value);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter an array : ");
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter an element for searching : ");
        int ele = sc.nextInt();
        System.out.println(find(arr,0,ele));
    }
}