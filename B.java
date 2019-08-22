import java.util.Scanner;

class B{
    public static double multiply(double a,double b){
        return a*b;
    }
    public static double sqr(double a){
        return multiply(a,a);
    }
    public static void main(String[] args) {
        double num1,num2,result;
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        num1=inp.nextDouble();
        System.out.println("Enter 2nd number :");
        num2=inp.nextDouble();
        result=multiply(num1, sqr(num1)) + multiply(num2, sqr(num2)) + multiply(3, multiply(num2, sqr(num1))) + multiply(3, multiply(num1, sqr(num2)));
        System.out.println(result); 
    }
    
        
}