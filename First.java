
class A {
    public void a1() {

        System.out.println("A class");
    }
}

class B extends A {
    public void b1() {

        System.out.println("B class");
    }
}

public class First {
    public static void main(String[] args) {

        B b = new B();
        b.a1();
        b.b1();
        System.out.println("prakash");
    }
}