import java.util.Scanner;
public class main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		
		int d = sc.nextInt();
		
		for(int i=d; i<n; i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0; i<d; i++){
			System.out.print(a[i]+" ");
		}
	}
}

