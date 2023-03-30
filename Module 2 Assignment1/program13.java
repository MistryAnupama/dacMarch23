class program13{
    public static void main(String[] args){

        short s=Short.parseShort(args[0]);
        String str=Short.toString(s);                       //short value to string
        System.out.println("String :"+str);

        Short s1=Short.valueOf(s);                          //short to short instance
        System.out.println("Short :"+s1);

        String str1=args[1];
        Short s2=Short.valueOf(str1);                          //string to short instance
        System.out.println("Short :"+s2);
    }
}