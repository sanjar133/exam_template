package question1;

public class OrderService {
    static Object object = new Object();

    int orderCount;

    public void increaseOrderCount() {
        synchronized (object) {
            this.orderCount += 1;
        }
    }

    public int getOrderCount() {
        return orderCount;
    }

}
