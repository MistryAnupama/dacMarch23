//pattern5
import java.util.*;
class pattern5{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char k='A';
		for(int i=1;i<=n;i++){						
			for(int j=1;j<=i;j++){				
				System.out.print(k+" ");				
			}
			k++;
			System.out.println();
		}
	}
}
