import java.util.*;
class pattern1{
	public static void main(String[] args){									//System.out.println(temp);
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
