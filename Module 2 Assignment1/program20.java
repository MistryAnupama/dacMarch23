/*a. long value into String
b. long value into Long instance.
c. String instance into Long instance.
d. long value into binary, octal and hexadecimal string.*/

class program20{
    public static void main(String[] args){

        long l=Long.parseLong(args[0]);
        String str=Long.toString(l);                      
        System.out.println("String :"+str);

        Long l1=Long.valueOf(l);
        System.out.println("Long :"+l1);

        Long l2=Long.valueOf(new String(args[1]));
        System.out.println("Long :"+l2);

        long l3=Long.parseLong(args[2]);
        String str1=Long.toBinaryString(l3);                      
        System.out.println("Binary String :"+str1);
        String str2=Long.toOctalString(l3);                      
        System.out.println("Octal String :"+str2);
        String str3=Long.toHexString(l3);                      
        System.out.println("Hex String :"+str3);
    }
}