package OOPS;
class Employee{
    int id;
    String name;
    int age;
    String salary;
    public void work(){
        System.out.println("I am working");
    }
    public void attendMeeting(String name){
        System.out.println(name + "  is attending meeting");
    }
}
public class Example {

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "John";
        emp.work();
        emp.attendMeeting(emp.name);
    }
}
