//pattern6
import java.util.*;
class pattern6{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=1;i<=n;i++){						
			for(int j=n;j>i;j--){				
				System.out.print("  ");				
			}
			for(int k=i;k>=1;k--){				
				System.out.print("* ");				
			}			
			System.out.println();
		}
	}
}