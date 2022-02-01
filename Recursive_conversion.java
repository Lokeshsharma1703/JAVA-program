import java.util.Scanner;
public class Recursive_conversion
{
    public static int convert_strToInt(String st,int currentIndex)
    {
        if(currentIndex<0)
        {
            return 0;
        }
        int n = st.charAt(currentIndex)-'0';
        return n=n+10*convert_strToInt(st,currentIndex-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String st = sc.nextLine();
        int num = convert_strToInt(st,st.length()-1);
        System.out.print("Number is : "+num);
    }
}