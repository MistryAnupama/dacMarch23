/*a. double value into String
b. double value into Double instance.
c. String instance into Double instance.
d. double value into binary, octal and hexadecimal 
string(Note: Here you can use doubleToLongBits() method 
along with methods of Long class).*/

class program28{
    public static void main(String[] args){

        double d=Double.parseDouble(args[0]);
        String str=Double.toString(d);                      
        System.out.println("String :"+str);

        Double d1=Double.valueOf(d);
        System.out.println("Double :"+d1);

        Double d2=Double.valueOf(new String(args[1]));
        System.out.println("Double :"+d2);

        String str1=Double.toHexString(d);                      
        System.out.println("Hex String :"+str1);
    }
}