/*to convert state of Integer instance into 
byte, short, int, long, float and double.*/

class program17{
    public static void main(String[] args){

        Integer i=new Integer(args[0]);
        byte b=i.byteValue();                            
        System.out.println("byte :"+b);

        short s=i.shortValue();                          
        System.out.println("short :"+s);

        int i1=i.intValue();                          
        System.out.println("int :"+i1);

        long l=i.longValue();                          
        System.out.println("long :"+l);

        float f=i.floatValue();                          
        System.out.println("float :"+f);

        double d=i.doubleValue();                          
        System.out.println("double :"+d);
        
    }
}