import java.util.Scanner;

public class method {
    public static int sum(int a,int b,int c){
        if((a>b)&& (b>c)){
            return a*b*c;
        }
        else{
            return a/b*c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(sum(a, b, c));
        sc.close();
    }
}
