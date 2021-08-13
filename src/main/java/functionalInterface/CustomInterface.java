package functionalInterface;

@FunctionalInterface
public interface CustomInterface<T> {

    void printName(T name);

    // default method 는 존재해도 상관없음
    default void printDefault() {
        System.out.println("Default Method");
    }

    // static method 는 존재해도 상관없음
    static void printStatic() {
        System.out.println("Static Method");
    }
}
