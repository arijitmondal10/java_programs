import java.util.Scanner;

public class fibonacciNew {
    public static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else{
            int fibonacci =fib(n-1)+fib(n-2);
            return fibonacci;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("The fibonacci of "+n+" is:"+fib(n));
        sc.close();
    }
    
}
