import java.util.Scanner;

class Inventory{
    private String title;
    private String author;
    private String publisher;
    private String isbn;
    private int year;
    private double price;
    private int quantity;
    Inventory(){
        this("","","","",0,0,0);
    }
    Inventory(String title, String author, String publisher, String isbn, int year, double price, int quantity){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
        this.isbn=isbn;
        this.year=year;
        this.price=price;
        this.quantity=quantity;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public void setIsbn(String isbn){
        this.isbn=isbn;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return this.price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void increaseQuantity(int value){
        this.quantity+=value;
    }
    public void decreaseQuantity(int value){
        this.quantity-=value;
    }
    public double getInventoryValue(){
        return this.quantity*this.price;
    }
}
class Bookinventory {
    static Scanner sc = new Scanner(System.in);
    static int menuList( ){
    System.out.println("0.Exit");
    System.out.println("1.Decrease Quantity");
    System.out.println("2.Increase Quantity");
    System.out.println("3.Get Inventory Value");
    System.out.print("Enter choice  : ");
    return sc.nextInt();
  }
  public static void main(String[] args) {
    int choice;
    System.out.print("Enter title : ");
    String title=sc.nextLine();
    System.out.print("Enter author : ");
    String author=sc.nextLine();
    System.out.print("Enter publisher : ");
    String publisher=sc.nextLine();
    System.out.print("Enter isbn : ");
    String isbn=sc.nextLine();
    System.out.print("Enter year : ");
    int year=sc.nextInt();
    System.out.print("Enter price : ");
    double price=sc.nextDouble();
    System.out.print("Enter quantity : ");
    int quantity=sc.nextInt();
    Inventory iv=new Inventory(title, author, publisher, isbn, year, price, quantity);
    while((choice=Bookinventory.menuList()) != 0){
        switch(choice){
            case 1:
            System.out.print("Enter quantity to be decreased : ");
            iv.decreaseQuantity(sc.nextInt());
            break;
            case 2:
            System.out.print("Enter quantity to be increased : ");
            iv.increaseQuantity(sc.nextInt());
            break;
            case 3:
            System.out.print("Inventory value is : "+ iv.getInventoryValue());
            break;
        }
    }
  }
}
