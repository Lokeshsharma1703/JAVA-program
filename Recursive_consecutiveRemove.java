import java.util.Scanner;
public class Recursive_consecutiveRemove
{
    public static void removeConsecutive(StringBuffer string, int currentIndex)
    {
        if(currentIndex==string.length()-1)
            return;
        if(string.charAt(currentIndex)==string.charAt(currentIndex+1))
        {
            string.deleteCharAt(currentIndex);
            currentIndex--;
        }
        removeConsecutive(string,currentIndex+1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuffer string = new StringBuffer(sc.nextLine());
        removeConsecutive(string,0);
        System.out.print("String : "+string);
    }
}