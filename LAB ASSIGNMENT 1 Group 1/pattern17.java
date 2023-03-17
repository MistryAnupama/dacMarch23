//pattern17
import java.util.*;
class pattern17{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++){						
			for(int j=1;j<=i;j++){				
				System.out.print(k+" ");
				k++;
			}			
			System.out.println();
		}
	}
}