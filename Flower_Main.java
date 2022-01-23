import java.util.Scanner;
class Flower
{
    private String name;
    private int noOfPetals;
    private float Price;
    Flower(String name, int noOfPetals, float Price)
    {
        this.name = name;
        this.noOfPetals = noOfPetals;
        this.Price = Price;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setNoOfPetals(int noOfPetals)
    {
        this.noOfPetals = noOfPetals;
    }
    public int getNoOfPetals()
    {
        return noOfPetals;
    }
    public void setPrice(float Price)
    {
        this.Price = Price;
    }
    public float getPrice()
    {
        return Price;
    }
}
public class Flower_Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Flower flower[] = new Flower[5];
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter name, no. of petals and Price of flower "+(i+1)+" respectively : ");
            flower[i] = new Flower(sc.next(),sc.nextInt(), sc.nextFloat());
        }
        System.out.println();
        for(int i=0;i<5;i++)
        {
            System.out.println("Name : "+flower[i].getName()+", No. of Petals : "+flower[i].getNoOfPetals()+", Price : "+flower[i].getPrice());
        }
    }
}