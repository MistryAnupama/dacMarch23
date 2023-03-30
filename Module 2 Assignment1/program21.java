/*to convert state of Long instance into byte, 
short, int, long, float and double.*/

class program21{
    public static void main(String[] args){

        Long l=new Long(args[0]);
        byte b=l.byteValue();                            
        System.out.println("byte :"+b);

        short s=l.shortValue();                          
        System.out.println("short :"+s);

        int i=l.intValue();                          
        System.out.println("int :"+i);

        long l1=l.longValue();                          
        System.out.println("long :"+l1);

        float f=l.floatValue();                          
        System.out.println("float :"+f);

        double d=l.doubleValue();                          
        System.out.println("double :"+d);
        
    }
}