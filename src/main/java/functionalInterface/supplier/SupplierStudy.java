package functionalInterface.supplier;

import java.util.function.Supplier;

public class SupplierStudy implements Supplier<String> {

    /*
    Supplier<T> : 인자를 받지 않고 T 타입의 객체를 리턴
    T get()
    */

    @Override
    public String get() {
        return "supplierStudy!";
    }

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "supplier!";
        System.out.println(supplier.get());

        SupplierStudy supplierStudy = new SupplierStudy();
        System.out.println(supplierStudy.get());
    }

}
