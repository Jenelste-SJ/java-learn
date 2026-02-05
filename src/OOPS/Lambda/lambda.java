package OOPS.Lambda;

@FunctionalInterface
 interface Program1 {
    void display();
}

@FunctionalInterface
interface Program2 {
    void display(int a);
}

@FunctionalInterface
interface Program3 {
    void display(int a, int b);
}
@FunctionalInterface
interface Program4 {
    int display(int a, int b);
}
public class lambda {
    public static void main(String[] args) {
        //if it is single expression no paranthesis
        Program1 p1 = () -> System.out.println("Hello World 1");
        p1.display();


        Program2 p2 = a -> System.out.println("Hello World 2");
        p2.display(5);


        // multiplr block of code mean paranthesis are neccasary
        Program3 p3 = (c,d) -> {
            int e = c+d;
            System.out.println(e);
        };
        p3.display(4,7);


        Program4 p4 = (f,g) -> f+g;
        System.out.println(p4.display(3,4));
    }
}
