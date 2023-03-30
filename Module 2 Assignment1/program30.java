/*program to find minimum and maximum number as well as 
to add two double numbers using methods of Double.*/

class program30{
    public static void main(String[] args){
        double x=Double.parseDouble(args[0]);
        double y=Double.parseDouble(args[1]);

        double a=Double.min(x,y);
        System.out.println("Min :"+a);

        double b=Double.max(x,y);
        System.out.println("Max :"+b);

        double c=Double.sum(x,y);
        System.out.println("Sum :"+c);
    }
}