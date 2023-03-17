//hollowfullpyramid
import java.util.*;
class hollowfullpyramid{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			if(i==1 || i==n){
				for(int k=1;k<=i;k++) System.out.print("* ");
			}
			else{
				for(int k=1;k<=2*i-1;k++){
					if(k==1 || k==2*i-1) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}