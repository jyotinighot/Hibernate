    import java.util.*;  
    class Book {  
    int id;  
    String name,author,publisher;  
    int quantity;  
    public Book(int id, String name, String author, String publisher, int quantity) {  
        this.id = id;  
        this.name = name;  
        this.author = author;  
        this.publisher = publisher;  
        this.quantity = quantity;  
    }  
    }  
    public class TestLinkedList {  
    public static void main(String[] args) {  
        //Creating list of Books  
        List<Book> list=new ArrayList<Book>(); 
        List list1=new ArrayList(); 
        list1.add(100);
        list1.add(85);
        list1.add(22);
        list1.add(56);
        list1.add(47);
        list1.add(45);
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);
        //Creating Books  
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
        //Adding Books to list  
        list.add(b1);  
        list.add(b2);  
        list.add(b3);  
        //Traversing list  
        for(Book b:list){  
        	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
        }  
    }  
    }  