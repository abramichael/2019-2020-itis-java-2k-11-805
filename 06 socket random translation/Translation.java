import java.util.Random;

public class Translation implements Runnable {

    private N n;

    public Translation(N n) {
        this.n = n;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            n.setData(r.nextInt(100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
