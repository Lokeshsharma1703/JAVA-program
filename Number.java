/*Create class Number with only one private instance variable as a int primitive type. Initialize it with parameterised constructor and include the following methods isZero( ),
isPositive(), isNegative( ), isOdd( ), isEven( ), isPrime(), isAmstrong() the above methods return boolean primitive type value. 
getFactorial(), getSqrt(), getSqr(), sumDigits()  these methods return int primitive type value.  
dispBinary(), dispOctal(), displayhexa() these method return string value */

import java.lang.Math;
public class Number
{
    private int num;
    void setnum(int num)
    {
        this.num = num;
    }
    int getnum()
    {
        return num;
    }
    boolean isZero()
    {
        if(num == 0)
            return true;
        else
            return false;
    }
    boolean isPositive()
    {
        if(num > 0)
            return true;
        else
            return false;
    }
    boolean isNegative()
    {
        if(num < 0)
            return true;
        else
            return false;
    }
    boolean isOdd()
    {
        if(num%2 != 0)
            return true;
        else
            return false;
    }
    boolean isEven()
    {
        if(num%2 == 0)
            return true;
        else
            return false;
    }
    boolean isPrime()
    {
        int c=0;
        for(int i=2;i<num/2;i++)
        {
            if(num%i == 0)
                c++;
        }
        if(c!=0)
            return false;
        else
            return true;
    }
    boolean isArmstrong()
    {
        int sum = 0,copy = num;
        while(copy !=0)
        {
            int temp = 0;
            for(int i=0;i<3;i++)
            {
                temp *= (copy%10);
            }
            sum+=temp;
            temp =0;
            copy = copy/10;
        }
        if(sum == num)
            return true;
        else
            return false;
    }
    int getFactorial()
    {
        int f=1;
        for(int i=1;i<=num;i++)
        {
            f*=i;
        }
        return f;
    }
    int getSqrt()
    {
        double n = num;
        double out = Math.sqrt(n);
        int ou = (int)out;
        return ou;
    }
    int getSqr()
    {
        return num*num;
    }
    int sumDigits()
    {
        int sum =0,cp = num;
        while(cp!=0)
        {
            sum+=(cp%10);
            cp=cp/10;
        }
        return sum;
    }
    String displayBinary()
    {
        return Integer.toBinaryString(num);
    }
    String displayOcatal()
    {
        return Integer.toOctalString(num);
    }
    String displayhexa()
    {
        return Integer.toHexString(num);
    }

    public static void main(String[] args)
    {
        Number obj = new Number();
        obj.setnum(7);
        System.out.println(obj.displayBinary());
        System.out.println(obj.displayhexa());
        System.out.println(obj.displayOcatal());
        System.out.println(obj.getSqr());
        System.out.println(obj.isPrime());
        System.out.println(obj.getFactorial());
        System.out.println(obj.isZero());
        System.out.println(obj.isPositive());
        System.out.println(obj.isNegative());
        System.out.println(obj.getSqrt());
        System.out.println(obj.isArmstrong());
        System.out.println(obj.isEven());
        System.out.println(obj.isOdd());
        System.out.println(obj.sumDigits());
    }
}
