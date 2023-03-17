//pattern12
import java.util.*;
class pattern12{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print("*");
			}			
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=n-i+1;j>=1;j--){
				System.out.print("*");
			}			
			System.out.println();
		}
	}
}