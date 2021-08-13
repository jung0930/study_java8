package functionalInterface.consumer;

import java.util.function.Consumer;

public class ConsumerStudy implements Consumer<String> {

    /*
    Consumer<T> : T 타입의 객체를 인자로 받고 리턴 값은 없음
    accept(T t), Consumer andThan(Consumer)
    */

    @Override
    public void accept(String input) {
        System.out.println("ConsumerStudy : " + input);
    }

    public static void main(String[] args) {
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String input) {
                System.out.println("Consumer : " + input);
            }
        };
        consumer.accept("consumer!!");

        ConsumerStudy consumerStudy = new ConsumerStudy();
        consumerStudy.accept("consumerStudy!!");

        // andThen() 을 사용하면 두개 이상의 Consumer 를 실행할 수 있다.
        consumer.andThen(consumerStudy).accept("consumer andThen");
        Consumer<String> andThan = consumer.andThen(consumerStudy);
        andThan.accept("consumer andThen");
    }

}
