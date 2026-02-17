
public class Method_Overloading {

    static void foo() {
        System.out.println("Good Morning!");
    }

    static void foo(String a) {
        System.out.println("Good Morning, " + a);
    }

    static void foo(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        foo();
        foo("World!");
        foo(1000);
    }
}
