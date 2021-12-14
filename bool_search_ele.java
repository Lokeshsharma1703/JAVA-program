import java.util.Scanner;
public class bool_search_ele
{
    boolean search_ele(int arr[], int ele)
    {
        int c=0;
        for(int i=0;i<arr.length;i++) {
            if (ele == arr[i])
                c+=1;
        }
        if(c!=0)
            return true;
        else
            return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[]{10, 20, 30, 40, 50};
        System.out.print("Enter the element which you want to search : ");
        int ele = sc.nextInt();
        bool_search_ele obj = new bool_search_ele();
        System.out.print(obj.search_ele(arr, ele));
    }
}
