import java.util.Scanner;

class TelephoneBill {
    String customerName;
    long phoneNumber;
    int numberOfCalls;
    int durationCalls;

    TelephoneBill(String customerName, long phoneNumber, int numberOfCalls, int durationCalls){
        this.customerName=customerName;
        this.phoneNumber=phoneNumber;
        this.numberOfCalls=numberOfCalls;
        this.durationCalls=durationCalls;
    }
    public void billAmount(){
        float bill=10;
        if(this.numberOfCalls > 0){
            if(this.numberOfCalls > 100){
                bill += 100*0.50;
                numberOfCalls -=100;
                bill += this.numberOfCalls*0.25;
            }
            else bill += numberOfCalls* 0.50;
        }   
        System.out.println("Bill Amount : " + bill);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=sc.nextLine();
        System.out.print("Enter Phone no : ");
        long phoneNumber=sc.nextLong();
        System.out.print("Enter number of calls made : ");
        int numberOfCalls=sc.nextInt();
        System.out.print("Enter duration of calls made : ");
        int durationOfCalls=sc.nextInt();

        TelephoneBill tb=new TelephoneBill(name, phoneNumber, numberOfCalls, durationOfCalls);
        tb.billAmount();
    }
}
