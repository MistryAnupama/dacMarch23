/*convert state of Short instance into byte, 
short, int, long, float and double.*/

class program14{
    public static void main(String[] args){

        Short s=new Short(args[0]);
        byte b=s.byteValue();                            
        System.out.println("byte :"+b);

        short s1=s.shortValue();                          
        System.out.println("short :"+s1);

        int i=s.intValue();                          
        System.out.println("int :"+i);

        long l=s.longValue();                          
        System.out.println("long :"+l);

        float f=s.floatValue();                          
        System.out.println("float :"+f);

        double d=s.doubleValue();                          
        System.out.println("double :"+d);
        
    }
}