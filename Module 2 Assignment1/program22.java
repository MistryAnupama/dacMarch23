/*a program to find minimum and maximum number as well as 
to add two long numbers using methods of Long.*/

class program22{
    public static void main(String[] args){
        long x=Long.parseLong(args[0]);
        long y=Long.parseLong(args[1]);

        long a=Long.min(x,y);
        System.out.println("Min :"+a);

        long b=Long.max(x,y);
        System.out.println("Max :"+b);

        long c=Long.sum(x,y);
        System.out.println("Sum :"+c);
    }
}