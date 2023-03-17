//pattern8
import java.util.*;
class pattern8{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){			
			for(int j=n-i;j>=1;j--){				
				System.out.print(" ");				
			}
			for(int k=n-i+1;k<=n;k++){				
				System.out.print(k+" ");				
			}
			System.out.println();
		}
	}
}