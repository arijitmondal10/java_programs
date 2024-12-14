
class Employee{
    int id;
    int salary;
    String name;
    public void printDitails(){
        System.out.println("My name is:"+name );
        System.out.println("My id is:"+id);
        
    }
    public int getSalary(){
        return salary;
    }
}

public class Oops {
    public static void main(String[] args) {
        Employee Harry = new Employee();
        Employee Akash = new Employee();
        //Setting attributes for harry
        Harry.id = 12;
        Harry.salary = 4000;
        Harry.name = "Harry Potter";
        //Setting attributes for Akash
        Akash.id =15;
        Akash.salary = 5000;
        Akash.name ="Akash Kumar";

        // System.out.println(Harry.id);
        Harry.printDitails();
        int salary = Harry.getSalary();
        System.out.println("The Monthly salary of Harry is:"+salary);
        System.out.println();

        Akash.printDitails();
       int salary2= Akash.getSalary();
       System.out.println("The Monthly salary of Akash is:"+salary2);

    }
}
