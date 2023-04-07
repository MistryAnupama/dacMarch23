import java.util.Scanner;

class TollBill {
    private String vehicleType;
    private int  numAxles;
    private  double distanceTraveled;
    private double tollFee;
    private double totalAmountDue;
    public void setVehicleType(String vehicleType){
        this.vehicleType=vehicleType;
    }
    public String getVehicleType(){
        return this.vehicleType;
    }
    public void setNumAxles(int numAxles){
        this.numAxles=numAxles;
    }
    public int getNumAxles(){
        return this.numAxles;
    }
    public void setDistanceTravelled(double distanceTraveled){
        this.distanceTraveled=distanceTraveled;
    }
    public double getDistanceTravelled(){
        return this.distanceTraveled;
    }
    public void setTollFee(double tollFee){
        this.tollFee=tollFee;
    }
    public double getTollFee(){
        return this.tollFee;
    }
    public double getAmountDue(){
        this.totalAmountDue=this.tollFee+2;
        return this.totalAmountDue;
    }
}
class TollTest{
    private static Scanner sc=new Scanner(System.in); 
    private TollBill tb=new TollBill();
    public int showMenu(){
        System.out.println("1.Enter vehicle type");
        System.out.println("2.Enter no of axles");
        System.out.println("3.Enter distance travelled");
        System.out.println("4.Calculate toll fee");
        System.out.println("5.Generate bill");
        System.out.println("6.Exit");
        System.out.print("Enter choice : ");
        return sc.nextInt();
    }
    public void vehicleType(){
        System.out.print("Enter vehicle type : ");
        sc.nextLine();
        String vt=sc.nextLine();
        if(vt.equals("car") || vt.equals("van") || vt.equals("bus") || vt.equals("truck") ){
            tb.setVehicleType(vt);
        }
        else System.out.println("Invalid vehicle type");
    }
    public void numOfAxles(){
        System.out.print("Enter no of axles : ");
        tb.setNumAxles(sc.nextInt());
    }
    public void enterDistance(){
        System.out.print("Enter distance travelled : ");
        tb.setDistanceTravelled(sc.nextDouble());
    }    
    private void calculateTollFee(){
        if(tb.getNumAxles()>0 && tb.getDistanceTravelled()>0 && tb.getVehicleType()!=null){
            double fee;
            if(tb.getVehicleType().equals("truck")){
                fee=0.50 * tb.getDistanceTravelled() * tb.getNumAxles();
            }
            else{
                fee=0.25 * tb.getDistanceTravelled() * tb.getNumAxles();    
            }
            tb.setTollFee(fee);
        }
        else System.out.println("Enter details");
    }
    private void generateBill(){
        calculateTollFee();
        if(tb.getNumAxles()>0 && tb.getDistanceTravelled()>0 && tb.getVehicleType()!=null){
            System.out.println("Vehicle Type : "+tb.getVehicleType());
            System.out.println("No of axles : "+tb.getNumAxles());
            System.out.println("Distance travelled : "+tb.getDistanceTravelled());
            System.out.println("Total fee : "+tb.getTollFee());
            System.out.println("Amount due : "+tb.getAmountDue());
        }
    }
        
    public static void main(String[] args) {
        int choice;
        TollTest tt=new TollTest();
        while((choice=tt.showMenu()) != 6){
            switch(choice){
                case 1:
                    tt.vehicleType();
                    break;
                case 2:
                    tt.numOfAxles();
                    break;
                case 3:
                    tt.enterDistance();
                    break;
                case 4:
                    tt.calculateTollFee();
                    break;
                case 5:
                    tt.generateBill();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        
    }
}
