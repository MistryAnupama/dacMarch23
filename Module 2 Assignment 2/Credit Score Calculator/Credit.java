import java.util.Scanner;

class Credit {
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;

    Credit(){
        this.creditHistory=0;
        this.creditUtilization=0;
        this.paymentHistory=false;
    }
    public void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }
    public int getCreditHistory(){
        return this.creditHistory;
    }
    public void setCreditUtilization(double creditUtilization){
        this.creditUtilization=creditUtilization;
    }
    public double getCreditUtilization(){
        return this.creditUtilization;
    }
    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }
    public boolean getPaymentHistory(){
        return this.paymentHistory;
    }
}
class Calculate{
    private static Scanner sc=new Scanner(System.in);
    private Credit ct=new Credit(); 
    public void input(){
        System.out.print("Enter credit history : ");
        ct.setCreditHistory(sc.nextInt());
        System.out.print("Enter credit utilization : ");
        ct.setCreditUtilization(sc.nextDouble());
        System.out.print("Enter payment history : ");
        ct.setPaymentHistory(sc.nextBoolean());
    }
    public void creditScore(){
        input();
        int creditScore;
        if(ct.getPaymentHistory()){
            creditScore = (ct.getCreditHistory() * 15) + (int)(ct.getCreditUtilization() * 30) + 55;
        }
        else{
            creditScore = (ct.getCreditHistory() * 15) + (int)(ct.getCreditUtilization() * 30) + 35;
        }
        System.out.println("Credit score : "+ creditScore);
    }
    public static void main(String[] args) {
        Calculate cl=new Calculate();
        cl.creditScore();
    }
}
