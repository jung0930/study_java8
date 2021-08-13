package methodReference;

public class Car {

    public Car() {
        System.out.println("기본 생성자");
    }

    public Car(String name) {
        System.out.println("생성자 1 : "+ name);
    }

    public Car(int distance) {
        System.out.println("생성자 2 : " + distance);
    }
}
