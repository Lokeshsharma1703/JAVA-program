import java.util.*;
class Company
{
    int products[] = new int[3];
}
public class Total_sales
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Company Salesman[] = new Company[5];
        for(int i=0;i<5;i++)
        {
            Salesman[i] = new Company();
            System.out.print("Enter the sales of 3 items sold by salesman "+(i+1)+" : ");
            for(int j=0;j<3;j++)
                Salesman[i].products[j] = sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            int sum=0;
            for(int j=0;j<3;j++)
                sum+=Salesman[i].products[j];
            System.out.println("Total sales by Salesman "+(i+1)+" : "+sum);
        }
        for(int i=0;i<3;i++)
        {
            int sum=0;
            for(int j=0;j<5;j++)
            {
                sum+=Salesman[j].products[i];
            }
            System.out.println("Total sales of item "+(i+1)+" : "+sum);
        }
    }
}