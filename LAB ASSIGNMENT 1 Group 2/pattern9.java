//pattern9
import java.util.*;
class pattern9{
	public static void main(String[] args){									
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){						
			for(int j=n;j>i;j--){				
				System.out.print(" ");				
			}
			for(int k=i;k>=1;k--){				
				System.out.print("*");				
			}			
			System.out.println();
		}
		for(int i=1;i<=n-1;i++){						
			for(int j=n;j>(n-i);j--){				
				System.out.print(" ");				
			}
			for(int k=n-1;k>=i;k--){				
				System.out.print("*");				
			}						
			System.out.println();
		}
	}
}
