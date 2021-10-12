/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

/**
Write a program has class Publisher, Book, Literature and Fiction. Read the information
and print the details of books from either the category, using inheritance.
 */
class Publisher
{
    String publisher;
    Publisher(String publi)
    {
    this.publisher=publi;
    }
}
class Book
{
String bname;
Publisher publisher;
Book(String bname,Publisher publisher)
{
    this.bname=bname;
    this.publisher=publisher;
}
}
class Literature extends Book
{
    String littype="literature";
    public Literature(String bname, Publisher publisher) {
        super(bname, publisher);
    }
void display()
{
System.out.println("name : "+super.bname);
System.out.println("type : "+this.littype);
System.out.println("publisher : "+this.publisher.publisher);
}
}
class Fiction extends Book
{
    String littype="fiction";

    public Fiction(String bname, Publisher publisher) {
        super(bname, publisher);
    }
    void display()
{
System.out.println("name : "+super.bname);
System.out.println("type : "+this.littype);
System.out.println("publisher : "+this.publisher.publisher);
}
}
public class BookInheritance {
    public static void main(String args[])
    {
    Publisher p=new Publisher("S.Chand");
    Literature l=new Literature("As you like it",p);
    l.display();
    Publisher pb = new Publisher("Tata McGraw Hill");
    Fiction f=new Fiction("Tempest",pb);
    f.display();
   
            }
}
