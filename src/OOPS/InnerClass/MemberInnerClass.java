package OOPS.InnerClass;

class OuterClass {
    int a = 10;

    class InnerClass {
        int b = 20;

        void innerDisplay() {
            System.out.println("Inside inner class display method");
            System.out.println(b);
            System.out.println(a);
        }
    }

    void outerDisplay() {
        System.out.println("Inside outer class display method");
        System.out.println(a);
        InnerClass ic = new InnerClass();
        System.out.println(ic.b);
    }
}

public class MemberInnerClass {
    public static void main(String[] args) {
        OuterClass oc = new OuterClass();
        oc.outerDisplay();

        OuterClass.InnerClass ic = oc.new InnerClass();
        ic.innerDisplay();
    }
}

