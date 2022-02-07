import java.util.Scanner;
public class Recursive_replaceChar
{
    public static void replaceChar(StringBuffer string,char c1, String c2, int currentPos)
    {
        if(currentPos==string.length())
            return;
        if(string.charAt(currentPos)==c1)
            string.replace(currentPos,currentPos+1,c2);
        replaceChar(string,c1,c2,currentPos+1);
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        StringBuffer string = new StringBuffer(sc.nextLine());
        System.out.print("Enter character C1 and C2 : ");
        char c1 = sc.next().charAt(0);
        String c2 = sc.next();
        replaceChar(string,c1,c2,0);
        System.out.println("String after replace : "+string);
    }
}