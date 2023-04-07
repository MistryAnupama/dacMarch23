import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

class DateTest {
    private static Scanner sc=new Scanner(System.in);
    private static String dateString;
    private static String timeString;
    public Date stringToDate(String str) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(str);
        return date;
    }
    public void dateFormat()throws ParseException{
        System.out.print("Enter date (dd/MM/yyyy) : ");
        dateString=sc.nextLine();
        Date date=stringToDate(dateString);
        
        System.out.println("a. dd/mm/yyyy");
        System.out.println("b. mm/dd/yyyy");
        System.out.println("c. yyyy/mm/dd");
        System.out.print("Enter format : ");
        char ch=sc.nextLine().charAt(0);
        switch(ch){
            case 'a':
            System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(date));
            break;
            case 'b':
            System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(date));
            break;
            case 'c':
            System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(date));
            break;
            default:
            System.out.println("Invalid format");
        }
    }
    public Date stringToTime(String str) throws ParseException{
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        Date time=sdf.parse(str);
        return time;
    }
    public void timeFormat() throws ParseException{
        System.out.print("Enter time (hh:mm:ss) : ");
        timeString=sc.nextLine();
        Date time=stringToTime(timeString);

        System.out.println("a. hh:mm:ss");
        System.out.println("b. hh:mm:ss AM/PM");
        System.out.println("c. hh:mm");
        System.out.print("Enter format : ");
        char ch=sc.nextLine().charAt(0);
        switch(ch){
            case 'a':
            
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(time));
            break;
            case 'b':
            System.out.println(new SimpleDateFormat("KK:mm:ss a").format(time));
            break;
            case 'c':
            System.out.println(new SimpleDateFormat("HH:mm").format(time));
            break;
            default:
            System.out.println("Invalid format");
        }
    }
    public void format() throws ParseException{
        Date date=stringToDate(dateString);
        Date time=stringToTime(timeString);
        System.out.println("a. dd/mm/yyyy hh:mm:ss");
        System.out.println("b. mm/dd/yyyy hh:mm:ss AM/PM");
        System.out.println("c. yyyy/mm/dd hh:mm");
        System.out.print("Enter format : ");
        char ch=sc.nextLine().charAt(0);
        switch(ch){
            case 'a':
            System.out.print(new SimpleDateFormat("dd/MM/yyyy ").format(date));
            System.out.print(new SimpleDateFormat("HH:mm:ss").format(time));
            break;
            case 'b':
            System.out.print(new SimpleDateFormat("MM/dd/yyyy ").format(date));
            System.out.print(new SimpleDateFormat("KK:mm:ss a").format(time));
            break;
            case 'c':
            System.out.print(new SimpleDateFormat("yyyy/MM/dd ").format(date));
            System.out.print(new SimpleDateFormat("HH:mm").format(time));
            break;
            default:
            System.out.println("Invalid format");
        }
    }

    public static void main(String[] args) throws ParseException {
       DateTest dt=new DateTest();
        dt.dateFormat();
        dt.timeFormat();
        dt.format();
    }
}
