package Pewarisan;

/**
 *
 * @author Muhammad Shobri
 */

// Superclass A
class A {
    int x, y;

    void TampilkanNilaiXY() {
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }
}

// Subclass B yang mewarisi A
class B extends A {
    int z;

    void TampilkanJumlah() {
        System.out.println("Jumlah (x + y + z): " + (x + y + z));
    }
}


public class demo {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        System.out.println("SuperClass");
        superOb.x = 10;
        superOb.y = 20;
        superOb.TampilkanNilaiXY();

        System.out.println("SubClass");
        subOb.x = 5;
        subOb.y = 4;
        subOb.TampilkanNilaiXY();

        subOb.z = 50;
        subOb.TampilkanJumlah();
    }
}
