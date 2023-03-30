/*a. int value into String
b. int value into Integer instance.
c. String instance into Integer instance.
d. int value into binary, octal and hexadecimal string.*/


class program16{
    public static void main(String[] args){

        int i=Integer.parseInt(args[0]);
        String str=Integer.toString(i);                      
        System.out.println("String :"+str);

        Integer i3=Integer.valueOf(i);
        System.out.println("Integer :"+i3);

        Integer i1=Integer.valueOf(new String(args[1]));
        System.out.println("Integer :"+i1);

        int i2=Integer.parseInt(args[2]);
        String str1=Integer.toBinaryString(i2);                      
        System.out.println("Binary String :"+str1);
        String str2=Integer.toOctalString(i2);                      
        System.out.println("Octal String :"+str2);
        String str3=Integer.toHexString(i2);                      
        System.out.println("Hex String :"+str3);
    }
}