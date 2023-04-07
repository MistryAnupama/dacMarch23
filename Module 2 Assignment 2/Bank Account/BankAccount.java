import java.util.Scanner;

class BankAccount {
    private String accountName;
    private int accountNumber;
    private double accountBalance;
    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public String getAccountName(){
        return this.accountName;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }
}
class Bank{
    private static Scanner sc=new Scanner(System.in);  
    private BankAccount acc=new BankAccount(); 
    public void createAccount(){
        System.out.print("Enter account holder's name : ");
        sc.nextLine();
        acc.setAccountName(sc.nextLine());
        System.out.print("Enter account Number : ");
        acc.setAccountNumber(sc.nextInt());
        
    }
    public void depositMoney(){
        System.out.print("Enter account number : ");
        if(sc.nextInt()==acc.getAccountNumber()){
            System.out.print("Enter amount to be deposited : ");
            acc.setAccountBalance(acc.getAccountBalance() + sc.nextDouble());
            System.out.println("Available balance : "+ acc.getAccountBalance());
        }
        else System.out.println("Invalid account number");
    }
    public void withdrawMoney(){
        System.out.print("Enter account number : ");
        if(sc.nextInt()==acc.getAccountNumber()){
            System.out.print("Enter amount to be withdrawn : ");
            double amount=sc.nextDouble();
            if(acc.getAccountBalance()<amount){
                System.out.println("Balance insufficient");
            } 
            else{
                acc.setAccountBalance(acc.getAccountBalance() - amount);
                System.out.println("Available balance : "+ acc.getAccountBalance());
            }
        }
        else System.out.println("Invalid account number");
    }
    public void balance(){
        System.out.print("Enter account number : ");
        if(sc.nextInt()==acc.getAccountNumber()){
            System.out.println("Available balance : "+ acc.getAccountBalance());
        }
        else System.out.println("Invalid account number");
    }
    public void printDetails(){
        System.out.print("Enter account number : ");
        if(sc.nextInt()==acc.getAccountNumber()){
            System.out.println("Account Name : " + acc.getAccountName());
            System.out.println("Available balance : "+ acc.getAccountBalance());
        }
        else System.out.println("Invalid account number");
    }
    public static int menuList(){
        System.out.println("0.Exit");
        System.out.println("1.Create a new account");
        System.out.println("2.Deposit money");
        System.out.println("3.Withdraw money");
        System.out.println("4.Display balance");
        System.out.println("5.Display account information");
        System.out.print("Enter choice  : ");
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int choice;
        Bank b=new Bank();
        while((choice=Bank.menuList()) != 0) {
            switch(choice){
                case 1:
                    b.createAccount();
                    break;
                case 2:
                    b.depositMoney();
                    break;
                case 3:
                    b.withdrawMoney();
                    break;
                case 4:
                    b.balance();
                    break;
                case 5:
                    b.printDetails();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
