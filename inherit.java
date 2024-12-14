class Shapeu{
  
}

class Circ extends Shapeu{
    int radius;

    // public int getrad(){
    //     return radius;
    // }
    public void setRad(int radius){
        this.radius = radius;
    }
   public void print(){
    System.out.println((3.14)*radius*radius);
   }
}
public class inherit {
    public static void main(String[] args) {
        Circ circle = new Circ() ;
        circle.setRad(10);
    //    System.out.println( circle.getrad());
       circle.print();

       
        
       
    }
}
