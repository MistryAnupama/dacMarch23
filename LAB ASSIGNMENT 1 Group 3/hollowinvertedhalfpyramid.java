//hollowinvertedhalfpyramid
import java.util.*;
class hollowinvertedhalfpyramid{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){						
			if(i==1 || i==n){
				for(int k=i;k>=1;k--){				
					System.out.print("*");
				}
			}
			else{
				for(int j=1;j<=i;j++){
					if(j==1 || j==i) System.out.print("*");
					else System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}