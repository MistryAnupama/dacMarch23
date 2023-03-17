//pattern13
import java.util.*;
class pattern13{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char x='A';
		for(int i=1;i<=n;i++){			
			for(int j=n-i;j>=1;j--){				
				System.out.print(" ");				
			}
			for(int k=1;k<=i;k++){				
				System.out.print(x+" ");
			}
			x++;
			System.out.println();
		}
	}
}