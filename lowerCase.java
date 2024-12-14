import java.util.Scanner;

public class lowerCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str= in.nextLine();
        str= str.toLowerCase();
        //---for uppercase
        // str= str.toUpperCase();
        System.out.println("IN LOWARCASE:");
        System.out.println(str);
        in.close();

        
    }
}
