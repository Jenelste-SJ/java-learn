package OOPS;
class Employee{
    static int id;
    public static void work(){
        id =20;
        System.out.println("I am working");
    }
    String name;
    public void attendMeeting(String name){
        System.out.println(name + "  is attending meeting");
    }
}
public class Static {

    public static void main(String[] args) {
        Employee.work();
        System.out.println(Employee.id);
        Employee emp = new Employee();
        emp.name = "John";
        emp.attendMeeting(emp.name);
    }
}
