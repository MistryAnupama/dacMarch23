import java.util.*;
class program33{
    public static void main(String[] args){
       int i=Integer.parseInt(args[0]);
       float f=Float.parseFloat(args[1]);
       double d=Double.parseDouble(args[2]);
        String str=args[3];
        char ch=str.charAt(0);
        switch(ch){
            case '+': float f1=i+f;
                    System.out.println(f1);
                    break;
            case '-': float f2=i-f;
                    System.out.println(f2);
                    break;
            case '/': double d1=f/i;
                    System.out.println(d1);
                    break;
            case '%': double d2=f%i;
                    System.out.println(d2);
                    break;
            default: System.out.println("Invalid operator");
        }
    }
}