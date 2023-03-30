

class program11{
    public static void main(String[] args){
        String str=args[0];
        char ch=str.charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            if(ch>='a' && ch<='z'){
                str=str.toUpperCase();
                int i=str.codePointAt(0);                       // int i=(int)ch;
                System.out.println(str + i);
            }
            else{
                str=str.toLowerCase();
                int i=str.codePointAt(0);
                System.out.println(str + i);
            }
        }
        else{
            int i=str.codePointAt(0);
            System.out.println(str + i);
        }
    }
}