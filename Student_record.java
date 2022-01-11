import java.util.Scanner;
class Student
{
    private int rollno;
    private String name;
    private int marks;
    public void setRollno(int rollno)
    {
        this.rollno=rollno;
    }
    public int getRollno()
    {
        return rollno;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setMarks(int marks)
    {
        this.marks = marks;
    }
    public int getMarks()
    {
        return marks;
    }
    Student(int rollno, int marks, String name)
    {
        this.setRollno(rollno);
        this.setName(name);
        this.setMarks(marks);
    }
}
public class Student_record
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=10;
        Student st[] = new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Roll no., Marks and Name of "+(i+1)+" Student respectively : ");
            st[i] = new Student(sc.nextInt(),sc.nextInt(),sc.nextLine());
        }
        int highest_marks = st[0].getMarks();
        int highest_marksStu = 0;
        int lowest_marks = st[0].getMarks();
        int lowest_marksStu = 0;
        for(int i=0;i<n;i++)
        {
            if (st[i].getMarks() > highest_marks)
            {
                highest_marks = st[i].getMarks();
                highest_marksStu = i;
            }
            else if (st[i].getMarks() < lowest_marks)
            {
                lowest_marks = st[i].getMarks();
                lowest_marksStu = i;
            }
        }
        System.out.println("Details of Student who got highest marks : ");
        System.out.println("Roll no. : "+st[highest_marksStu].getRollno());
        System.out.println("Name : "+st[highest_marksStu].getName());
        System.out.println("Marks : "+st[highest_marksStu].getMarks());
        System.out.println("Details of Student who got lowest marks : ");
        System.out.println("Roll no. : "+st[lowest_marksStu].getRollno());
        System.out.println("Name : "+st[lowest_marksStu].getName());
        System.out.println("Marks : "+st[lowest_marksStu].getMarks());
    }
}