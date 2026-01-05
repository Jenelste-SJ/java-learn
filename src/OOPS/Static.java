package OOPS;
class Employee{
    static int id;
    static int b;
    int a;
    public static void work(){
        id =20;
        System.out.println("I am working");
    }
    static {
        System.out.println("I am static");
    }


    String name;
    public void attendMeeting(String name){
        a++;
        b++;
        System.out.println(name + "  is attending meeting");
    }
}
public class Static {

    public static void main(String[] args) {
        Employee.work();
        System.out.println(Employee.id);

        Employee emp = new Employee();
        Employee emp2 = new Employee();
        emp.name = "John";
        emp.attendMeeting(emp.name);
        emp.attendMeeting(emp.name);
        emp2.attendMeeting(emp.name);
        System.out.println(Employee.b);

    }
}
