import java.util.Scanner;

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    ElectricityBill(String customerName, double unitsConsumed){
        this.customerName=customerName;
        this.unitsConsumed=unitsConsumed;
    }
    public double calculateBillAmount(){
        if(this.unitsConsumed > 300){
            this.billAmount += 100*5;
            this.unitsConsumed-=100;
            this.billAmount += 200*7;
            this.unitsConsumed-=200;
            this.billAmount += this.unitsConsumed * 10;
            return this.billAmount;
        }
        else if(this.unitsConsumed > 100 && this.unitsConsumed <= 300){
            this.billAmount += 100*5;
            this.unitsConsumed-=100;
            this.billAmount += this.unitsConsumed * 7;
            return this.billAmount;
        }
        else{
            return this.unitsConsumed * 5;
        }
    }
    public void getElectricityBill(){
        System.out.println("Customer Name : " + this.customerName);
        System.out.println("Units consumed : " + this.unitsConsumed);
        System.out.println("Bill Amount : " + this.calculateBillAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name=sc.nextLine();
        System.out.print("Enter units consumed : ");
        double units=sc.nextDouble();
        ElectricityBill eb=new ElectricityBill(name,units);
        eb.getElectricityBill();
    }
}
