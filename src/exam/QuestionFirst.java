package exam;

public class QuestionFirst {
    static Object object = new Object();

    int count;

    public void increment() {
        synchronized (object) {
            count++;
        }
    }

    public int getCount() {
        return count;
    }

}
