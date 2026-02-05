package OOPS.InnerClass;
interface Program {
    void display1();
    void display2();
}
public class anony {
    public static void main(String[] args) {
        Program program = new Program() {
            @Override
            public void display1() {
                System.out.println("Hi");
            }
            @Override
            public void display2() {
                System.out.println("Hello");
            }
        };
        program.display1();
        program.display2();
    }
}
