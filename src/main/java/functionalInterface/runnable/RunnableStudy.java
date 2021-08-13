package functionalInterface.runnable;

public class RunnableStudy implements Runnable{

    /*
    Runnable : 인자를 받지 않고 리턴값도 없음
    run()
    */

    @Override
    public void run() {
        System.out.println("runnable!");
    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("run!");
        runnable.run();

        RunnableStudy runnableStudy = new RunnableStudy();
        runnableStudy.run();
    }

}
