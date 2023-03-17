//pattern18
import java.util.*;
class pattern18{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=1;i<=n;i++){
			char k='A';			
			for(int j=n;j>=i;j--){				
				System.out.print(k+" ");
				k++;
			}			
			System.out.println();
		}
	}
}