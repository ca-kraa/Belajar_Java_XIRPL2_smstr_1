package Dynamic_Binding;

public class Object {
}
    class A extends Object {
        @Override
        public String toString() {
            return "Method toString() dari class A dipanggil";
        }
    }

    class B extends A {
        @Override
        public String toString(){
            return "Method toString () dari class B dipanggil";
        }
    }
    class C extends B {
        @Override
        public String toString() {
            return "Methood toString () dari class C dipanggil";
        }
    }

    class D extends C {
    }
    class E extends D{
    }
    class TestDynamicBinding{
        static void perintah(Object myObject){
            System.out.println(myObject.toString());
        }
        public static void main(String[] args) {
            perintah(new E());
            perintah(new D());
            perintah(new C());
            perintah(new B());
            perintah(new A());
            perintah(new Object());
        }
    }
