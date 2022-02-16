import java.util.Scanner;
public class remove_vowels
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine();
        StringBuffer st = new StringBuffer(s);
        for(int i=0;i<st.length();i++)
        {
            if(st.charAt(i) == 'a'||st.charAt(i) == 'A'||st.charAt(i) == 'e'||st.charAt(i) == 'E'||
                    st.charAt(i) == 'i'||st.charAt(i) == 'I'||st.charAt(i) == 'o'||st.charAt(i) == 'O'
                    ||st.charAt(i) == 'u'||st.charAt(i) == 'U')
            {
                st.deleteCharAt(i);
            }
        }
        System.out.print("String after removing vowels in it : "+st);
    }
}
