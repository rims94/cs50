import java.util.*;
class recursiveFibo{
	static int rfibo(int n){
		if (n==0 || n==1) {
			return n;	
		}
		else{
			return (rfibo(n-1)+rfibo(n-2));
		}
	}
	public static void main(String[] args) {
		int n;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter The Number Of Terms :");
		n=inp.nextInt();
		System.out.print("The Fibonacci Series is :");
		callFibo(n);
	}
	public static void callFibo(int n){
		int i=0;
		for (i=0;i<n;i++) {
			System.out.print(rfibo(i)+ " ");
		}
		System.out.print("\n");
	} 
}