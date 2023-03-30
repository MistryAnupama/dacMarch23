/*a program to find minimum and maximum number as well as 
to add two integer numbers using methods of Integer.*/

class program18{
    public static void main(String[] args){
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);

        int a=Integer.min(x,y);
        System.out.println("Min :"+a);

        int b=Integer.max(x,y);
        System.out.println("Max :"+b);

        int c=Integer.sum(x,y);
        System.out.println("Sum :"+c);
    }
}