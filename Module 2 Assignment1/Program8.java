class Program8{
    public static void main(String[] args){
        byte b1=Byte.parseByte(args[0]);
        String str1=Byte.toString(b1);                          //convert byte value to string
        System.out.println(str1);

        Byte b2=Byte.valueOf(b1);                               //byte value into byte instance
        System.out.println(b2);

        String str2=args[1];
        Byte b3=Byte.valueOf(str2);                             //string instance into byte instance
        System.out.println(b3);
    }
}