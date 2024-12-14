
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<5;i++){

        }
        //Add sth
        List.add(0);
        List.add(2);
        List.add(3);

        System.out.println(List);
        

        //Get elements
        int element = List.get(0);
        // System.out.println( List.get(0));
        System.out.println(element);
        

        //Add element in between
        List.add(1,7);
        System.out.println(List);

        //Set element
        List.set(0, 5);
        System.out.println(List);

        //delete element
        List.remove(0);
        System.out.println(List);

        //size
        int size =List.size();
        System.out.println(size);

        //loops
        for(int i=0;i<List.size();i++)
        {
            System.out.print(List.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(List);
        System.out.println(List);

        sc.close();
    }
}
