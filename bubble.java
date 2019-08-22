class bubblesort {
	public static void sort(a) {
		int i=0;
		int n=a.length;
		while(a[i]>a[i+1]) {
			for (i=0;i<n;i++) {
				if (a[i]>a[i+1]) {
					swap(a[i],a[i+1]);
				}
			}
		}
	}
	public void swap(int a[],int a,int b){
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
		int a[] = {10, 7, 8, 9, 1, 5};
		int len=A.length; 
		bubblesort bubble=new bubble();
		bubble.bubblesort(a);
		System.out.println("sorted array"); 
        bubble.printArray(a);  
	}
}