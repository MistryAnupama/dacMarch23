//pyramid pattern1
import java.util.*;
class pyramidpattern1{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){						
			for(int j=n;j>i;j--){				
				System.out.print(" ");				
			}
			for(int k=i;k>=1;k--){				
				System.out.print(i+" ");				
			}			
			System.out.println();
		}
	}
}