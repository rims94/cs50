import java.util.*;
class bubblesort {
	public void sort(int a[]) {
		int i=0;
		int j=0;
		int n=a.length;
		for(i=0;i<n;i++) {
			for (j=0;j<n-1;j++) {
				if (a[j]>=a[j+1]) {
					swap(a,j,j+1);
				}
			}
		}
	}
	public void input(int a[]){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter The Elements of array :");
		for (int c=0;c<a.length;c++) {
			a[c]=inp.nextInt();
		}
	}
	public void swap(int x[],int a,int b){
		int temp;
		temp=x[a];
		x[a]=x[b];
		x[b]=temp;
	}
	static void printArray(int a[]) 
    { 
        int l = a.length; 
        for (int i=0; i<l; ++i) 
            System.out.print(a[i]+" "); 
        System.out.println(); 
    } 
	public static void main(String[] args) {
		bubblesort bubble=new bubblesort();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array :"); 
		int r=in.nextInt();
		int a[]=new int[r];
		bubble.input(a);
		int len=a.length; 
		bubble.sort(a);
		System.out.println("sorted array"); 
        bubble.printArray(a);  
	}
}