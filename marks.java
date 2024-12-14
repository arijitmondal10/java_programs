import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of subjects:");
        int n = in.nextInt();
        float marks[]= new float[n];
        float sum=0;
        System.out.println("Enter your marks:");
        for(int i=0;i<n;i++)
        {
            marks[i]=in.nextInt();
            sum= sum+marks[i];
        }
       float percentage;
       percentage=(sum/n);
       System.out.println("Percentage of the subjects is:"+percentage+"%");
        in.close();
    }
}
