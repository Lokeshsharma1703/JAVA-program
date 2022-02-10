import java.util.*;
public class String_LinkedList
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        LinkedList list = new LinkedList();
        for(int i=0;i<s.length();i++)
        {
            list.add(s.charAt(i));
        }
        for(int i=0;i<list.size()-1;i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println(list.get(list.size()-1));
    }
}