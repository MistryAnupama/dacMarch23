/*a program to convert state of Double instance into byte, 
short, int, long, float and double.*/

class program29{
    public static void main(String[] args){

        Double d=new Double(args[0]);
        byte b=d.byteValue();                            
        System.out.println("byte :"+b);

        short s=d.shortValue();                          
        System.out.println("short :"+s);

        int i=d.intValue();                          
        System.out.println("int :"+i);

        long l=d.longValue();                          
        System.out.println("long :"+l);

        float f=d.floatValue();                          
        System.out.println("float :"+f);

        double d1=d.doubleValue();                          
        System.out.println("double :"+d1);
        
    }
}