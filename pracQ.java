
class nothing{
    protected int p1 =20;
    int p2 = 21;
}

class dis extends nothing{
   
   public  void printt(){
    System.out.println(p1);
    System.out.println(p2);
   }
}
public class pracQ {
    public static void main(String[] args) {
        dis di = new dis();
        di.printt();
    }
}
