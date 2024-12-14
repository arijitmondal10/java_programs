//problem 1//

// class Employee2{
//     int salary;
//     String name;
//     public int getSal(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }

//     public void SetName(String n){
//         name=n;
//     }
// }


// public class practice_39 {
//     public static void main(String[] args) {
//         Employee2 arijit = new Employee2();
       
//         arijit.salary = 1000000;
//         System.out.println(arijit.getSal());
//         arijit.SetName("Arijit Mondal");
//         System.out.println(arijit.getName());

        
//     }
// }



//---problem 2---//

/*class cellphone{
    public void ring(){
        System.out.println("ringing...");
    }
    public void vibrate(){
        System.out.println("vibrating...");
    }
    public void callFriend(){
        System.out.println("Call Messi...");
    }
}

public class practice_39 {
    public static void main(String[] args) {
        cellphone poco = new cellphone();
        poco.ring();
        poco.callFriend();
        poco.vibrate();

    }
}
*/


//problem 3//

class square{
    int side;
    // int area;

    public int areaOfSquare(){
        // area = side*side;
        // return area;
        return side*side;
    }

    public int perimeter(){
         return 4*side;
    }
    
}

class rectangle{
    int side;
    int side2;
    public int areaOfrectangle(){
        return side*side2;
    }

    public int perimeter2(){
        return 2*(side+side2);
    }
}

public class practice_39 {
    public static void main(String[] args) {
        square sq = new square();
         sq.side = 10;
        System.out.println(sq.areaOfSquare());
        System.out.println(sq.perimeter());

        rectangle rec = new rectangle();
        rec.side=5;
        rec.side2= 4;
        System.out.println(rec.areaOfrectangle());
        System.out.println(rec.perimeter2());
    }
}