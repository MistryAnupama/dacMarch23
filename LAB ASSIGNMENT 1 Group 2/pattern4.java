//pattern4
import java.util.*;
class pattern4{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=1;i<=n;i++){						
			for(int j=n;j>(n-i);j--){				
				System.out.print(" ");				
			}
			for(int k=n;k>=i;k--){				
				System.out.print("*");				
			}						
			System.out.println();
		}
	}
}