package functionalInterface;

public class App {

    public static void main(String[] args) {

        // 익명 클래스
        CustomInterface<String> customInterface = new CustomInterface<String>() {
            @Override
            public void printName(String name) {
                System.out.println("Hello " + name);
            }
        };
        customInterface.printName("jung");

        // 람다로 변경
        CustomInterface<String> customInterfaceByLambda = name -> System.out.println("Hello Lambda " + name);
        customInterfaceByLambda.printName("jung");

    }

}
