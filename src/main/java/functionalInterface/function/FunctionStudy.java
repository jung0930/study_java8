package functionalInterface.function;

import java.util.function.Function;

public class FunctionStudy implements Function<Integer, Integer> {

    /*
    Function<T, R> : T 타입의 인자를 받고, R 타입의 객체를 리턴
    R accept(T t), Function andThen(Function), Function compose(Function)
    */

    @Override
    public Integer apply(Integer integer) {
        return integer + 2;
    }

    public static void main(String[] args) {
        Function<Integer, Integer> multiply = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * 3;
            }
        };
        System.out.println(multiply.apply(3));

        FunctionStudy add = new FunctionStudy();
        System.out.println(add.apply(3));

        // andThen
        Function<Integer, Integer> functionAndThen = multiply.andThen(add);
        System.out.println(functionAndThen.apply(5));

        // compose
        Function<Integer, Integer> functionCompose = multiply.compose(add);
        System.out.println(functionCompose.apply(5));

    }

}
