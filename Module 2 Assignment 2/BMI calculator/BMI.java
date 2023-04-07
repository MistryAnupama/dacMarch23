import java.util.*;

class BMI {
    double height;
    double weight;
    BMI(){
        this.height=0;
        this.weight=0;
    }
    public void setBMI(double height, double weight){
        this.height=height;
        this.weight=weight;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWeight(){
        return this.weight;
    }
    public double calculateBMI(){
        return this.weight / (this.height * this.height);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BMI b=new BMI();
        System.out.print("Enter height : ");
        double height=sc.nextDouble();
        System.out.print("Enter weight : ");
        double weight=sc.nextDouble();
        b.setBMI(height,weight);
        System.out.println(b.calculateBMI());
    }
}
