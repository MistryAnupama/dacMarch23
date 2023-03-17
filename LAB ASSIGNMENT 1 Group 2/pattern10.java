//pattern10
import java.util.*;
class pattern10{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n-i;j>=0;j--){
				System.out.print(" ");
			}
			for(int k=n;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}