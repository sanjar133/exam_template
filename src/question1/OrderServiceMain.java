package question1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class OrderServiceMain {

    public static void main(String[] args) throws InterruptedException {


        OrderService orderService = new OrderService();

        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            Runnable task = () -> orderService.increaseOrderCount();

            for (int i = 0; i < 1000; i++) {
                executorService.submit(task);
            }
        }
        Thread.sleep(1000);

        System.out.println("orderService.getOrderCount() = " + orderService.getOrderCount());

    }


}
