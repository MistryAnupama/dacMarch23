//pattern11
import java.util.*;
class pattern11{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=n;k>=1;k--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}