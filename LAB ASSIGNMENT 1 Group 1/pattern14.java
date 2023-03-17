//pattern14
import java.util.*;
class pattern14{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=n;i>=1;i--){						
			for(int j=1;j<=i;j++){				
				System.out.print(j+" ");				
			}			
			System.out.println();
		}
	}
}