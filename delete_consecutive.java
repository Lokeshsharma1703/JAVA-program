import java.util.*;

public class delete_consecutive
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.print("Enter the no. of elements : ");
        int n = sc.nextInt();
        System.out.print("Enter elements : ");
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n-1;i++)
        {
            if(arr.get(i)==arr.get(i+1))
            {
                arr.remove(i);
                n-=1;
                i-=1;
            }
        }
        for(Integer i : arr)
            System.out.print(i+" ");
    }
}