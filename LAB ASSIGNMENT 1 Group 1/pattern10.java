//pattern10
import java.util.*;
class pattern10{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char x='A';
		for(int i=1;i<=n;i++){						
			for(int j=n-i;j>=1;j--){				
				System.out.print(" ");				
			}
			for(int k=n-i;k<n;k++){				
				System.out.print((char)(x+k) + " ");				
			}			
			System.out.println();
		}
	}
}