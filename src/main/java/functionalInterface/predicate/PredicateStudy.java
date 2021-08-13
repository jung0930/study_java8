package functionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateStudy implements Predicate<String> {

    /*
    Predicate<T> : T 타입 인자를 받고 결과로 boolean 을 리턴
    boolean test(T t), Predicate and(Predicate), Predicate or(Predicate), isEqual()
    */

    @Override
    public boolean test(String s) {
        return "Study".equals(s);
    }

    public static void main(String[] args) {

        Predicate<String> lengthCheck = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 5;
            }
        };
        System.out.println(lengthCheck.test("abcde"));
        System.out.println(lengthCheck.test("1234"));
        System.out.println("====================================");

        PredicateStudy predicateStudy = new PredicateStudy();
        System.out.println(predicateStudy.test("Study"));
        System.out.println(predicateStudy.test("study"));
        System.out.println("====================================");

        // and() : 둘 다 true 면 true 반환
        System.out.println(lengthCheck.and(predicateStudy).test("Study"));
        System.out.println(lengthCheck.and(predicateStudy).test("study"));
        System.out.println("====================================");

        // or() : 하나 이상 true 면 true 반환
        System.out.println(lengthCheck.or(predicateStudy).test("Study"));
        System.out.println(lengthCheck.or(predicateStudy).test("study"));
        System.out.println(lengthCheck.or(predicateStudy).test("abcde"));
        System.out.println("====================================");

        // isEqual() : Static 메소드, 인자로 전달되는 객체와 같은지 체크하는 Predicate 객체를 만들준다.
        Predicate<String> isEqualPredicate = Predicate.isEqual("TEST");
        System.out.println(isEqualPredicate.test("TEST"));
        System.out.println("====================================");

    }

}
