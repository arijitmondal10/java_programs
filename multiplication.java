import java.util.Scanner;

public class multiplication {

    //--- using recursion
public static int table1(int m,int i){

  if(i<=10){
    System.out.println(m+"*"+i+"="+(m*i));
   return table1(m,(i+1));
  }
  return 1;
  }


    // public static void table(int n){
    //     for(int i=1;i<=10;i++)
    //     {
    //         System.out.format("%d*%d = %d \n",n,i,n*i);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int i=1;
       table1(m,i);
        sc.close();
      
    }
}
