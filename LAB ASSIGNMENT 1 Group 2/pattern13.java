//pattern13
import java.util.*;
class pattern13{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){
			for(int j=n-i;j>0;j--){
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--){
			for(int j=i-1;j>=1;j--){
				System.out.print(" ");
			}
			for(int k=n-i+1;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}