/*a. float value into String
b. float value into Float instance.
c. String instance into Float instance.
d. float value into hexadecimal string.*/

class program24{
    public static void main(String[] args){

        float f=Float.parseFloat(args[0]);
        String str=Float.toString(f);                      
        System.out.println("String :"+str);

        Float f1=Float.valueOf(f);
        System.out.println("Float :"+f1);

        Float f2=Float.valueOf(new String(args[1]));
        System.out.println("Float :"+f2);

        String str1=Float.toHexString(f);                      
        System.out.println("Hex String :"+str1);
    }
}