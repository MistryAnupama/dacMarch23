//pyramid pattern 5
import java.util.*;
class pyramidpattern5{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>=1;i--){						
			for(int j=1;j<i;j++){				
				System.out.print("  ");				
			}
			for(int k=i;k<=n;k++){				
				System.out.print(k+" ");				
			}
			for(int k=n-1;k>=i;k--){				
				System.out.print(k+" ");				
			}				
			System.out.println();
		}
	}
}