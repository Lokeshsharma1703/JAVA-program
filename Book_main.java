package Exam;
class Book
{
    int book_id;
    String book_name;
    int no_pages;
    float book_price;
    Book(int id,String name, int pages, float price)
    {
        this.book_id = id;
        this.book_name = name;
        this.no_pages = pages;
        this.book_price = price;
    }
}
public class Book_main
{
    public static void main(String[] args)
    {
        Book book[] = new Book[10];
        book[0]= new Book(1,"A",40,500);
        book[1] = new Book(2,"B",400,1500);
        book[2] = new Book(3,"C",640,2570);
        book[3] = new Book(4,"D",70,430);
        book[4] = new Book(5,"E",90,6500);
        book[5] = new Book(6,"F",420,9550);
        book[6] = new Book(7,"G",460,1938);
        book[7] = new Book(8,"H",478,3700);
        book[8] = new Book(9,"I",470,200);
        book[9] = new Book(10,"J",340,670);
        float max_price = book[0].book_price;
        int index_max=0;
        float min_price = book[0].book_price;
        int index_min=0;
        for(int i=0;i<10;i++)
        {
            if(book[i].book_price > max_price) {
                max_price = book[i].book_price;
                index_max = i;
            }
            else if(book[i].book_price < min_price) {
                min_price = book[i].book_price;
                index_min = i;
            }
        }
        float diff = max_price - min_price;
        System.out.println("Difference between highest book price and minimum book price : " + diff);
        System.out.println("Details of Maximum price book : ");
        System.out.println("Book name : "+book[index_max].book_name);
        System.out.println("Book ID : "+book[index_max].book_id);
        System.out.println("No. of pages : "+book[index_max].no_pages);
        System.out.println("Book Price : "+book[index_max].book_price);
        System.out.println();
        System.out.println("Details of Minimum price book : ");
        System.out.println("Book name : "+book[index_min].book_name);
        System.out.println("Book ID : "+book[index_min].book_id);
        System.out.println("No. of pages : "+book[index_min].no_pages);
        System.out.println("Book Price : "+book[index_min].book_price);
    }
}
