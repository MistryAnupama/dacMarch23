/*a program to find minimum and maximum number as well as 
to add two float numbers using methods of Float.*/

class program26{
    public static void main(String[] args){
        float x=Float.parseFloat(args[0]);
        float y=Float.parseFloat(args[1]);

        float a=Float.min(x,y);
        System.out.println("Min :"+a);

        float b=Float.max(x,y);
        System.out.println("Max :"+b);

        float c=Float.sum(x,y);
        System.out.println("Sum :"+c);
    }
}