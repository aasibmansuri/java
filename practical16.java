class A {
    void displayA() {
        System.out.println("Inside class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Inside class B");
    }
}

class C extends A {
    void displayC() {
        System.out.println("Inside class C");
    }
}

public class practical16 {

    public static void main(String[] args) {
        A a = new A();
        a.displayA();

        B b = new B();
        b.displayA();
        b.displayB();

        C c = new C();
        c.displayA();
        c.displayC();
    }
}