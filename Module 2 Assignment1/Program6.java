class Program6{
    
    public static void main(String[] args){
        boolean b=Boolean.parseBoolean(args[0]);
        String str=Boolean.toString(b);                                 //boolean value to string
        System.out.println(str);

        boolean b1=Boolean.parseBoolean(args[0]);
        String str1=String.valueOf(b1);                                 //boolean value to String 2nd method
        System.out.println(str1);

        boolean b2=Boolean.parseBoolean(args[0]);
        Boolean b3=Boolean.valueOf(b2);                                  //boolean value into Boolean instance
        System.out.println(b3);

        String str2=args[0];
        boolean b4=Boolean.parseBoolean(str2);                          //string value into boolean value
        System.out.println(b4);

        String str3=args[0];
        Boolean b5=Boolean.valueOf(Boolean.parseBoolean(str3));           //string value into Boolean instance
        System.out.println(b5);
    }
}