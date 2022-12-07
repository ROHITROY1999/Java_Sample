import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class tcstry {
    public static void main(String args[] ) throws Exception {
        Book[] books = new Book[4];
        double min = 0;
        double max = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<books.length;i++)
        {
            int id = sc.nextInt();
            String title = sc.nextLine();
            String author = sc.nextLine();
            sc.nextLine();
            double price = sc.nextDouble();

            books[i]= new Book(id,title,author,price);
        }
        min = sc.nextDouble();
        max = sc.nextDouble();

        Book[] newBooks = booksWithPriceRange(min,max,books);

        for(int b=0;b<newBooks.length;b++)
            System.out.println(newBooks[b].getId());
    }

    //implement business methods here
    public static Book[] booksWithPriceRange(double min,double max,Book[] books){
        int count=0;
        for(int i=0;i<books.length;i++){
            if(books[i].getPrice()>=min && books[i].getPrice()<=max){
                count++;
            }
        }
        Book[] temp = new Book[count];
        count=0;
        for(int i=0;i<books.length;i++)
        {
            if(books[i].getPrice()>=min && books[i].getPrice()<=max){
                temp[count++]=books[i];
            }
        }
        for(int i=0;i< temp.length;i++){
            for(int j=i+1;j<temp.length;j++){
                if(temp[j].getId()<temp[i].getId()){
                    Book y=temp[j];
                    temp[j]=temp[i];
                    temp[i]=y;
                }
            }
        }
        return temp;
    }
}

class Book
{
    //implement class here
    int id;
    String title;
    String author;
    double price;
    public Book(int id,String title,String author,double price){
        super();
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public int getId(){return this.id;}
    public String getTitle(){return this.title;}
    public String getAuthor(){return this.author;}
    public double getPrice(){return this.price;}

}
