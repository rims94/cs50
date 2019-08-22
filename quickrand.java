import java.util.*;
class quickrand {
	public static void main(String[] args) {
        int low=0;
		quick q=new quick();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of the array :"); 
		int r=in.nextInt();
		int A[]=new int[r];
		int high=r;
		q.input(A);
		q.quickSort(A,low,high-1);
		System.out.println("sorted array"); 
        q.printArray(A); 
	}
	public void quickSort(int A[],int low,int high) {
		if (low<high) {
			int p=partition(A,low,high);
			quickSort(A,low,p-1);
			quickSort(A,p+1,high);
		}
	} 
	public void input(int A[]){
		Scanner inp=new Scanner(System.in);
		System.out.print("Enter The Elements of array :");
		for (int c=0;c<A.length;c++) {
			A[c]=inp.nextInt();
		}
	}
	public void swap(int x[],int a,int b) {
		int temp;
		temp=x[a];
		x[a]=x[b];
		x[b]=temp;
	}
	static void printArray(int A[]) { 
        int n = A.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(A[i]+" "); 
        System.out.println(); 
    }
    void random(int A[],int low,int high) { 
        Random rand= new Random(); 
        int pivot = rand.nextInt(high-low) + low; 
        swap(A,pivot,high); 
    }  
	public int partition(int A[],int low,int high) {
		int x=A[high];
		int i=low-1;
		for (int j=low;j<=(high-1);j++) {
			if (A[j]<=x) {
				i++;
				swap(A,i,j);
			}
		}
		swap(A,(i+1),high);
		return (i+1);
	}
}
