/*to convert state of Byte instance into byte, 
short, int. long, float and double.*/

class Program9{
    public static void main(String[] args){
        Byte b=new Byte(Byte.parseByte(args[0]));
        byte b1=b.byteValue();
        System.out.println("byte :"+b1);

        short s=b.shortValue();
        System.out.println("short :"+s);

        short s1=b1;
        System.out.println("short :"+s1);


        int i=b.intValue();
        System.out.println("int :"+i);

        int i1=b1;
        System.out.println("int :"+i1);

        long l=b1;
        System.out.println("long :"+l);

        float f=b1;
        System.out.println("float :"+f);

        double d=b1;
        System.out.println("double :"+d);
    }
}