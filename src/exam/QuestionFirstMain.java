package exam;

public class QuestionFirstMain {

    public static void main(String[] args) throws InterruptedException {


        QuestionFirst counter = new QuestionFirst();

        Runnable task = () -> counter.increment();

        for (int i = 0; i < 1000; i++) {
            new Thread(task).start();
        }

        Thread.sleep(3000);

        System.out.println("counter.getCount() = " + counter.getCount());

    }


}
