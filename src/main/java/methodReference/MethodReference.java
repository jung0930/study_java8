package methodReference;

import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {

    public static void main(String[] args) {
        Supplier<Car> create1 = Car::new;

        Function<Car, String> create2 = Car::new;

        // Function<Car, Boolean> f = String::isEmpty;


    }



}
