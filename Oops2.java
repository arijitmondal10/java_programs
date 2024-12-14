
class Shape{
    String name;
    int id;
    
    public  void printArea(){
        System.out.println("displays area");
    }
}
class Triangle extends Shape{
    public void printArea(int h,int b){
        System.out.println(1/2*h*b);
    }
}
// class Circle extends Shape{
    
//     public  void printArea(int r){
//         System.out.println((3.14)*r*r);
//     }
// }
class Circle {
    String name;
    int id;

public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.id);
    }

Circle(String name,int id){
  this.name = name;
  this.id = id;
}
}
public class Oops2 {
    public static void main(String[] args) {

        // Info s1 = new Info();
        // s1.name = "Arijit";
        // // s1.id = 100;
        // s1.printInfo(); 
        Circle c2 = new Circle("Arijit",5);
        c2.printInfo();
       
    }
}
