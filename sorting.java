
// //bubble short--->
 
// import java.util.Scanner;

// public class sorting {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = sc.nextInt();
//         int arr[]= new int[n];
//         System.out.println("Enter elements in the array:");
//         for(int i=0;i<arr.length;i++)
//         {
//             arr[i]=sc.nextInt();
//         }

//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-i-1;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]= temp;
//                 }
//             }
//         }
//         System.out.println();
//        for(int i=0;i<arr.length;i++)
//        {
//         System.out.println(arr[i]);
//        }
//     }
// }




//selection sorting-->

public class sorting{
    public static void main(String[] args) {
        int arr[]={3,2,7,1,4};
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int arr[]= new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]= sc.nextInt();
        // }

        for(int i=0;i<arr.length-1;i++)
        {
            int smallest =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                    
                }
            }
            int temp = arr[i];
            arr[i]=arr[smallest];
            arr[smallest]= temp;
        
        }
       for(int i=0;i<arr.length;i++)
       {
        System.out.println(arr[i]);
        
       }
    }
}
