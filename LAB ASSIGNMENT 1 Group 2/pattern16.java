//pattern16
import java.util.*;
class pattern16{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i==1 || i==n){
				for(int j=n-i;j>=1;j--){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				for(int j=n-i;j>=1;j--){
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					if(k==1 || k==i) System.out.print("*");
					else System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}