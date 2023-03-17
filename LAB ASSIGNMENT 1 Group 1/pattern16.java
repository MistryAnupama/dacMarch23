//pattern16
import java.util.*;
class pattern16{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=n;i>=1;i--){						
			for(int j=n;j>=i;j--){				
				System.out.print(j+" ");				
			}			
			System.out.println();
		}
	}
}