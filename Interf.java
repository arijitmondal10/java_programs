
//so basically in interface we can only use public and abstract in front of it...(can't use static)
//if we use default in methods then it can be accessed by the object directly...
//we can create multiple intefaces together...and also can implement them in a class...

interface MyCellPhone{
    static int v=35;
    void pickCall();
    void cutCall();
    // abstract void noCall();
    // void noCall();
    default void recordCall(){
        System.out.println("Recording started...");
    }
}

interface MySong{
    void downloadSong();
    void listen();
}

//java doesn't support multiple inheritence in classes-->
//we can only extend one parent class in a child class...

class mobileGame{
    public void ludo(){
        System.out.println("Wanna play?");
    }
}

class MySmartPhone extends mobileGame implements MyCellPhone,MySong{
    public void pickCall(){
        System.out.println("Hello...");
    }
   
    public void cutCall(){
        System.out.println("Sorry! Busy this time...");
    }
    public void downloadSong(){
        System.out.println("Download started...");
    }
    public void listen(){
        System.out.println("Listening :)");
    }
}



public class Interf {
    public static void main(String[] args) {
        MySmartPhone sm = new MySmartPhone();
        sm.cutCall();
        sm.recordCall();
        // System.out.println(sm.v);
        sm.ludo();


        //another way of representation-->
        // MyCellPhone mi;
        // mi= new MySmartPhone();
        // mi.pickCall();
        
    }
}
