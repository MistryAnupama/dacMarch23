/*program to convert state of Float instance into byte, 
short, int, long, float and double.*/

class program25{
    public static void main(String[] args){

        Float f=new Float(args[0]);
        byte b=f.byteValue();                            
        System.out.println("byte :"+b);

        short s=f.shortValue();                          
        System.out.println("short :"+s);

        int i=f.intValue();                          
        System.out.println("int :"+i);

        long l=f.longValue();                          
        System.out.println("long :"+l);

        float f1=f.floatValue();                          
        System.out.println("float :"+f1);

        double d=f.doubleValue();                          
        System.out.println("double :"+d);
        
    }
}