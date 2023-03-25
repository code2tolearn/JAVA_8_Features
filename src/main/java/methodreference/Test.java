package methodreference;

public class Test {
    public static void m2(){
        System.out.println("this is m2 method");
    }

    public static void main(String[] args) {
        MyInterface mi = Test::m2;
        mi.m1();

    }
}
