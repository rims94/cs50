import java.util.ArrayList;
import java.util.List;
import java.util.*;
class ecommerceweb {
	public String productName;
	public int price;
	public int quantity;
	public int bill=0;
	public char ex;
	Scanner inp=new Scanner(System.in);
	public ecommerceweb() {}
	public ecommerceweb(String productName,int price,int quantity) {
		this.productName=productName;
		this.price=price;
		this.quantity=quantity;
	}
	public String get_productName() {
		return productName;
	}
	public void set_productName(String productName) {
		this.productName=productName;
	}
	public int get_price() {
		return price;
	}
	public void set_price(int price) {
		this.price=price;
	}
	public int get_quantity() {
		return quantity;
	}
	public void set_quantity(int quantity) {
		this.quantity=quantity;
	}
	public String toString() {
		return "productName : "+productName+"\t price : "+price+"\t quantity :"+quantity;
	}
	void catalogFill(ArrayList<ecommerceweb> catalog){
		catalog.add(0, new ecommerceweb("jeans",500,0));
		catalog.add(1, new ecommerceweb("Shirts",300,0));
		catalog.add(2, new ecommerceweb("joggers",200,0));
		catalog.add(3, new ecommerceweb("t-shirts",400,0));
		catalog.add(4, new ecommerceweb("Shoes",700,0));
		catalog.add(5, new ecommerceweb("kurta",200,0));
		catalog.add(6, new ecommerceweb("boxer",150,0));
		catalog.add(7, new ecommerceweb("socks",90,0));
		catalog.add(8, new ecommerceweb("hand carchief",50,0));
		catalog.add(9, new ecommerceweb("inner ware",200,0));
	}
	void printCatalog(ArrayList<ecommerceweb> catalog){
		for(int p=0;p<catalog.size();p++){
			System.out.println(p+"."+catalog.get(p));
		}
	}
	void add2cart(ArrayList<ecommerceweb> catalog,ArrayList<ecommerceweb> cart) {
		System.out.print("Enter a choice:");
		int ch=inp.nextInt();
		System.out.print("enter the quantity:");
		int q=inp.nextInt();
		if(ch>=0 && ch<10) {
			cart.add(new ecommerceweb(catalog.get(ch).productName,catalog.get(ch).price,q));
		}
	}
	void viewCart(ArrayList<ecommerceweb> cart) {
		if(cart.isEmpty()==false) {
			System.out.println("________________________________________________________________________________\n");
			System.out.println("CART:");
			for (ecommerceweb i:cart) {
				System.out.println(i);
			}
			System.out.println("________________________________________________________________________________\n");
		}
		else {
			System.out.println("\n\t\t\t YOUR CART IS EMPTY ! START SHOPPING !");
			System.out.println("________________________________________________________________________________\n");
		}
	}
	void billAmount(ArrayList<ecommerceweb> cart) {
		if(cart.isEmpty()==false) {
			int len=cart.size();
			for(int x=0;x<len;x++){
				bill+=cart.get(x).price * cart.get(x).quantity;
			}
			System.out.println("________________________________________________________________________________\n");
			System.out.println("\n\t\t\t Your Bill Amount is :"+bill);
			System.out.println("________________________________________________________________________________\n");
			bill=0;
			cart.clear();
		}
		else {
			System.out.println("\n\t\t\t YOUR CART IS EMPTY ! START SHOPPING !");
			System.out.println("________________________________________________________________________________\n");
		}
	}
	void conditionCheck() {
		System.out.println("Do you want to continue ? Type 'y' to continue,'n' to exit");
		System.out.println("________________________________________________________________________________\n");
        ex=inp.next().charAt(0);
        if(ex=='n' || ex=='N' || ex=='y' || ex=='Y') {
        	if(ex=='n' || ex=='N') {
        		System.out.println("\n\t\t\t THANK YOU FOR SHOPPING WITH US");
        		System.out.println("________________________________________________________________________________\n");
        		System.exit(0);
        	}
    	}
        else{
        	System.out.println("I\n\t\t\t NVALID CHOICE ! WE ARE SORRY TO TERMINATE !");
        	System.out.println("________________________________________________________________________________\n");
        }
	}
	public static void main(String[] args) {
		ecommerceweb e=new ecommerceweb();
		ArrayList<ecommerceweb> catalog=new ArrayList<>();
		ArrayList<ecommerceweb> cart=new ArrayList<>();
		e.catalogFill(catalog);
		System.out.println("\n\t\t\t LOOK ME ONLINE GARMENTS STORE");
		System.out.println("________________________________________________________________________________\n");
		do{
		System.out.println("\n 1. OPEN THE CATALOG \n 2. VIEW THE CART \n 3. CHECK OUT \n 4. EXIT");
		System.out.print("Enter a choice:");
		int choice=e.inp.nextInt();
		switch(choice) {
			case 1:
				e.printCatalog(catalog);
				e.add2cart(catalog,cart);
				break;
			case 2:
				e.viewCart(cart);
				break;
			case 3:
				e.billAmount(cart);
				break;
			case 4:
			    System.out.println("\n\t\t\t THANK YOU FOR SHOPPING WITH US");
        		System.out.println("________________________________________________________________________________\n");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice !");
                break;
		}
		e.conditionCheck();
        } while (e.ex=='y' || e.ex=='Y');
        e.inp.close();
    }

}